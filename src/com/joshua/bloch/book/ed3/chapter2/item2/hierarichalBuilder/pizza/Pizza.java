package com.joshua.bloch.book.ed3.chapter2.item2.hierarichalBuilder.pizza;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;


public class Pizza
{
	public enum Topping {
		mushroom, olive, mozzarelaCheeze, spinach, zucchini, tomato;
	}
	private final Set<Topping> toppings;

	abstract static class Builder<T extends Builder	<T>>
	{
		private EnumSet<Topping> toppings =  EnumSet.noneOf(Topping.class);

		public T addTopping(Topping topping)
		{
			toppings.add(Objects.requireNonNull(topping));
			return self();
		}
		protected abstract T self();
		abstract Pizza build();
	}

	@Override
	public String toString()
	{
		return "Pizza{" +
						"toppings=" + toppings +
						'}';
	}

	protected Pizza(Builder<?> builder)
	{
		toppings =  builder.toppings.clone();
	}

}
