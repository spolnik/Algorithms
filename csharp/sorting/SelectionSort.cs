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
			Console.WriteLine(string.Join(";", SelectionSort(input)));
		}
	}
	
	private static int[] SelectionSort(int[] input)
	{
		var n = input.Length;
		
		for (var j = 0; j < n - 1; j++)
		{
			var smallest = j;
			for (var i = j + 1; i < n; i++)
			{
				if (input[i] < input[smallest])
					smallest = i;
			}
			
			var temp = input[j];
			input[j] = input[smallest];
			input[smallest] = temp;
		}
		
		return input;
	}
}