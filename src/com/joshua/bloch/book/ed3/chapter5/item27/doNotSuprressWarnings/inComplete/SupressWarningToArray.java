package com.joshua.bloch.book.ed3.chapter5.item27.doNotSuprressWarnings.inComplete;

import java.util.Arrays;

///////////
/////////// INCOMPLETE///////////////////
///////////

public class SupressWarningToArray
{
	private final int size = 100;
	private String[] elements;
	public <T> T[] toArray(T[] a)
	{
		if(a.length<size)
		{
			return (T[]) Arrays.copyOf(elements, size, a.getClass());
		}
		System.arraycopy(elements, 0, a, 0, size);
		if (a.length > size)

			a[size] = null;

		return a;
	}

	public static void main(String[] args)
	{
		System.out.println("hello world");
	}
}
