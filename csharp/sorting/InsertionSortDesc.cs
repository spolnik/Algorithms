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
			Console.WriteLine(string.Join(";", InsertionSortDesc(input)));
		}
	}
	
	private static int[] InsertionSortDesc(int[] input)
	{
		for (var j = 1; j < input.Length; j++)
		{
			var key = input[j];
			
			var i = j - 1;
			while (i > -1 && input[i] < key)
			{
				input[i + 1] = input[i];
				i--;
			}
			
			input[i+1] = key;
		}
		
		return input;
	}
}