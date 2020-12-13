package com.joshua.bloch.book.ed3.chapter4.item23.TaggedClasses;

public class Figure
{
	enum Shape {
		Rectangle, Circle;
	}

	//instance
	final Shape shape;

	//BROKEN

	//used only if a Rectange
	double width, length;

	//used only if a Circle
	double radius;

	//make a circle
	Figure(double radius)
	{
		this.radius = radius;
		shape = Shape.Circle;
	}

	Figure(double width, double length)
	{
		this.width = width;
		this.length = length;
		shape = Shape.Rectangle;
	}

	double area()
	{
		switch (shape)
		{
			case Circle:
				return Math.PI * radius* radius;
			case Rectangle:
				return length*width;
			default:
				throw new AssertionError(shape);
		}
	}


}
