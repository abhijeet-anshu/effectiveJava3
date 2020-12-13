package com.joshua.bloch.book.ed3.chapter4.item19.inheritance.brokenConstructor;

import java.time.Instant;

class Super
{
	//broken! constructor invokes ovverridden method
	public Super()
	{
		overrideMe();
	}

	public void overrideMe()
	{
		System.out.println("am super");
	}

}

class Smart extends Super
{
	private final Instant instant;
	public Smart()
	{
		instant  = Instant.now();
	}

	@Override
	public void overrideMe()
	{
		System.out.println("am was instantiated at " + instant);
	}
}


public class ConstructorWithOverriddenMethod
{
	public static void main(String[] args)
	{
		Smart sm = new Smart();
	}
}
