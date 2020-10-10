package com.joshua.bloch.book.ed3.chapter2.item2.hierarichalBuilder.client;

import com.joshua.bloch.book.ed3.chapter2.item2.hierarichalBuilder.pizza.*;

import static com.joshua.bloch.book.ed3.chapter2.item2.hierarichalBuilder.pizza.NewYorkPizza.PizzaSize.*;
import static com.joshua.bloch.book.ed3.chapter2.item2.hierarichalBuilder.pizza.Pizza.Topping.*;

public class PizzaStore
{
	public static void main(String[] args)
	{
		Pizza nyA = new NewYorkPizza.Builder(small).addTopping(zucchini).addTopping(mushroom).charge(100).build();
		Pizza calZone = new CalZone.Builder().addTopping(mozzarelaCheeze).addTopping(tomato).addTopping(olive).
						sauceIn(true).build();
		System.out.println(nyA);
		System.out.println(calZone);
	}
}
