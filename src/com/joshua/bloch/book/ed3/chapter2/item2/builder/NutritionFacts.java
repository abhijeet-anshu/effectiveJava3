package com.joshua.bloch.book.ed3.chapter2.item2.builder;

/**
 * Item 2
 */
public class NutritionFacts
{
	private  int servingSize = 0; //mL required
	private  int servings = 0;// quantity
	private  int calories = 0; // per serving
	private  int fat = 0; //g per serving
	private  int sodium = 0; //mg per serving
	private  int carbohydrate = 0; // g/serving

	private NutritionFacts(Builder b)
	{
		servingSize = b.servingSize;
		servings = b.servings;
		calories = b.calories;
		fat = b.fat;
		sodium = b.sodium;
		carbohydrate = b.carbohydrate;
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

	static class Builder
	{
		private final  int servingSize ; //mL     compulsory
		private final  int servings ;// quantity  compulsary
		private  int calories = 0; // per serving
		private  int fat = 0; //g per serving
		private  int sodium = 0; //mg per serving
		private  int carbohydrate = 0; // g/serving

		public Builder(int servingSize, int servings) //constructor for mandatory fields
		{
			this.servingSize = servingSize;
			this.servings = servings;
		}


		public NutritionFacts build()
		{
			return new NutritionFacts(this);
		}

		private Builder calories(int val)
		{
			calories = val; return this;
		}

		private Builder fat(int val)
		{
			fat = val;return this;
		}

		private Builder sodium(int val)
		{
			sodium = val;return this;
		}

		private Builder carbohydrate(int val)
		{
			carbohydrate = val;return this;
		}
	}

	public static void main(String[] args)
	{
		NutritionFacts coke =
			new Builder(12,1 ).calories(100).fat(12).sodium(0).build();

		System.out.println(coke);

		//below line will not compile if un commented, so immutable
		//coke.setCalories(0);
		//System.out.println(coke);

	}


}
