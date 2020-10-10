package com.joshua.bloch.book.ed3.chapter2.item2.telescopicConstructor;

/**
 * Item 2
 */
public class NutritionFacts
{
	private final int servingSize; //mL required
	private final int servings;// quantity
	private final int calories; // per serving
	private final int fat; //g per serving
	private final int sodium; //mg per serving
	private final int carbohydrate; // g/serving

	public NutritionFacts(int servingSize, int calories)
	{
		this(servingSize, 0, calories, 0, 0, 0);
	}

	public NutritionFacts(int servingSize, int servings, int calories)
	{
		this(servingSize, servings, calories, 0, 0, 0);

	}

	public NutritionFacts(int servingSize, int servings, int calories, int carbohydrate)
	{
		this(servingSize, servings, calories, 0, 0, carbohydrate);
	}

	public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate)
	{
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbohydrate = carbohydrate;
	}

	public static void main(String[] args)
	{
		NutritionFacts coke =
			new NutritionFacts(10, 4, 200, 10, 1, 10);
	}
}
