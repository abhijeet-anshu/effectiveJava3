package com.joshua.bloch.book.ed3.chapter2.item2.hierarichalBuilder.pizza;

public class CalZone extends Pizza
{
	private final boolean sauceIn;
	//declare builder
	public static class Builder extends Pizza.Builder<Builder>
	{
		private boolean sauceIn;

		public Builder sauceIn(boolean val){ this.sauceIn = val; return  this;}

		@Override
		public CalZone build() {return new CalZone(this); }

		@Override
		protected Builder self()  {return this;}
	}

	private CalZone(Builder builder)
	{
		super(builder);
		sauceIn = builder.sauceIn;
	}

	@Override
	public String toString()
	{
		return super.toString() + "CalZone{" +
						"sauceIn=" + sauceIn +
						'}';
	}
}
