package joshua.block.qa;
public class ByteDelight
{
	//https://www.oracle.com/technical-resources/articles/javase/bloch-effective-08-qa.html
	public static void main(String[] args)
	{
		for (byte b = Byte.MIN_VALUE;
				 b < Byte.MAX_VALUE; b++) {
			if (b == 0x90)
				System.out.print("Joy!");
		}
		//know what it is
		System.out.println(0x90);

	}
}
