package com.joshua.bloch.book.ed3.chapter2.item2.hierarichalBuilder.pizza;

import java.util.Objects;

public class NewYorkPizza extends Pizza
{
	public enum PizzaSize {small, large, medium};
	private final PizzaSize pizzaSize;
	private final int charge;

	public static class Builder extends Pizza.Builder<Builder>
	{
		private final PizzaSize pizzaSize;
		private int charge = 0;

		public  Builder(PizzaSize val) {this.pizzaSize = Objects.requireNonNull(val);}

		public Builder charge(int value) {charge = value; return this;}

		@Override
		public NewYorkPizza build() {return new NewYorkPizza(this);}

		@Override
		protected  Builder self() {return this;}
	}

	@Override
	public String toString()
	{
		return super.toString() + "NewYorkPizza{" +
						"pizzaSize=" + pizzaSize +
						", charge=" + charge +
						'}';
	}

	private NewYorkPizza(Builder builder)
	{
		super(builder);
	 	pizzaSize = builder.pizzaSize;
	 	charge = builder.charge;
	}
}
