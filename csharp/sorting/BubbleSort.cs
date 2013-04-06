using System;
using System.IO;
using System.Linq;

public class Program
{
	public static void Main(string[] args)
	{
		using (var reader = new StreamReader(args[0]))
		{
			int[] input = reader.ReadLine().Split(';').Select(x => Convert.ToInt32(x)).ToArray();	
			Console.WriteLine(string.Join(";", BubbleSort(input)));
		}
	}
	
	private static int[] BubbleSort(int[] input)
	{
		int n = input.Length;
		for (int i = 0; i < n; i++)
		{
			for (int j = input.Length - 1; j > i; j--)
			{
				if (input[j] < input[j - 1])
				{
					int tmp = input[j];
					input[j] = input[j - 1];
					input[j - 1] = tmp;
				}
			}
		}
		
		return input;
	}
}