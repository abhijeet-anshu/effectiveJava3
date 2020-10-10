package com.joshua.bloch.book.ed3.chapter2.item2.javaBeans;

/**
 * Item 2
 */
public class NutritionFacts
{
	int servingSize; //mL required
	int servings;// quantity
	int calories; // per serving
	int fat; //g per serving
	int sodium; //mg per serving
	int carbohydrate; // g/serving

	public void setServingSize(int servingSize)
	{
		this.servingSize = servingSize;
	}

	public void setServings(int servings)
	{
		this.servings = servings;
	}

	public void setCalories(int calories)
	{
		this.calories = calories;
	}

	public void setFat(int fat)
	{
		this.fat = fat;
	}

	public void setSodium(int sodium)
	{
		this.sodium = sodium;
	}

	public void setCarbohydrate(int carbohydrate)
	{
		this.carbohydrate = carbohydrate;
	}



	@Override
	public String toString()
	{
		return "NutritionFacts{" +
						"servingSize=" + servingSize +
						", servings=" + servings +
						", calories=" + calories +
						", fat=" + fat +
						", sodium=" + sodium +
						", carbohydrate=" + carbohydrate +
						'}';
	}

	public static void main(String[] args)
	{
		NutritionFacts coke = new NutritionFacts();
		coke.setCalories(100);
		coke.setServings(1);
		coke.setServingSize(11);

		System.out.println(coke);

		//not at all mutable
		coke.setCalories(0);
		System.out.println(coke);
	}
}
