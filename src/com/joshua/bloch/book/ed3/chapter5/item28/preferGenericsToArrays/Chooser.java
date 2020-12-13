package com.joshua.bloch.book.ed3.chapter5.item28.preferGenericsToArrays;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser
{
	private final Object[] choiceArray;
	Chooser(Collection choices)
	{
		choiceArray = choices.toArray();
	}
	public Object choose()
	{
		Random rnd = ThreadLocalRandom.current();
		return choiceArray[rnd.nextInt(choiceArray.length)];
	}
}
