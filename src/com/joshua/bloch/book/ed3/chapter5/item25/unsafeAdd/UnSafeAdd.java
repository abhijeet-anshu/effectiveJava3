package com.joshua.bloch.book.ed3.chapter5.item25.unsafeAdd;

import java.util.ArrayList;
import java.util.List;

public class UnSafeAdd
{
	public static void main(String[] args)
	{
		List<String> unsafeList = new ArrayList<String>();
		unsafeAdd(unsafeList,  Integer.valueOf(1));
		String s = unsafeList.get(0);
	}

	/*broken*/
	private static void unsafeAdd(List myNoCategoryList, Object object)
	{
		myNoCategoryList.add(object);
	}

}
