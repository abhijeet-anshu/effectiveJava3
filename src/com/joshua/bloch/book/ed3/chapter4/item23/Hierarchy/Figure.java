package com.joshua.bloch.book.ed3.chapter4.item23.Hierarchy;

abstract public class Figure
{
	abstract public double area();
}

class Rectangle extends Figure
{
	final int length;
	final int width;

	Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	@Override
	public double area()
	{
		return length * width;
	}
}

class Circle
{
	final int Radius;

	public Circle(int radius)
	{
		Radius = radius;
	}

	public double area()
	{
		return Math.PI*Radius*Radius;
	}

}
