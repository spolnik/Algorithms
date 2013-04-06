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
			MergeSort(input, 0, input.Length - 1);
			Console.WriteLine(string.Join(";", input));
		}
	}

	private static void MergeSort(int[] input, int left, int right)
	{
		if (left < right)
		{
			var middle = (left + right)/2;

			MergeSort(input, left, middle);
			MergeSort(input, middle + 1, right);
			Merge(input, left, middle, right);
		}
	}

	private static void Merge(int[] input, int p, int q, int r)
	{
		var leftEnd = q - p + 1;
		var rightEnd = r - q;

		var left = new int[leftEnd + 1];
		var right = new int[rightEnd + 1];

		int i, j;

		for (i = 0; i < leftEnd; i++)
			left[i] = input[p + i];

		for (i = 0; i < rightEnd; i++)
			right[i] = input[q + i + 1];

		left[leftEnd] = int.MaxValue;
		right[rightEnd] = int.MaxValue;

		i = 0;
		j = 0;

		for (var k = p; k <= r; k++)
		{
			if (left[i] <= right[j])
				input[k] = left[i++];
			else
				input[k] = right[j++];
		}
	}
}