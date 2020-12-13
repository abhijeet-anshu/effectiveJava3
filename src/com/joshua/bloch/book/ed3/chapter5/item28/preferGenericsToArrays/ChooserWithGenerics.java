package com.joshua.bloch.book.ed3.chapter5.item28.preferGenericsToArrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.List.of;

public class ChooserWithGenerics<T>
{
	private final List<T> choiceList;
	ChooserWithGenerics(Collection<T> choices)
	{
		choiceList = new ArrayList<>(choices);
	}
	public  T choose()
	{
		Random rnd = ThreadLocalRandom.current();
		return  choiceList.get(rnd.nextInt(choiceList.size()));
	}
}
