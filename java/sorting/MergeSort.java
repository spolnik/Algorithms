import java.util.*;
import java.io.*;

public class MergeSort {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String path = args[0];
		
		File file = new File(path);
		byte[] bytes = new byte[(int) file.length()];
		FileInputStream fis = new FileInputStream(file);
		fis.read(bytes);
		fis.close();
		
		String[] valueStr = new String(bytes).trim().split(";");
		int[] input = new int[valueStr.length];
		for (int i = 0; i < valueStr.length; i++)
			input[i] = Integer.parseInt(valueStr[i]);
		
		MergeSort(input, 0, input.length - 1);
		
		StringBuilder sb = new StringBuilder();		
		String prefix = "";
		
		for (int item : input) {
		  sb.append(prefix);
		  prefix = ";";
		  sb.append(item);
		}
		
		System.out.println(sb.toString());
	}
	
	private static void MergeSort(int[] input, int left, int right)
	{
		if (left < right)
		{
			int middle = (left + right)/2;

			MergeSort(input, left, middle);
			MergeSort(input, middle + 1, right);
			Merge(input, left, middle, right);
		}
	}

	private static void Merge(int[] input, int p, int q, int r)
	{
		int leftEnd = q - p + 1;
		int rightEnd = r - q;

		int[] left = new int[leftEnd + 1];
		int[] right = new int[rightEnd + 1];

		int i, j;

		for (i = 0; i < leftEnd; i++)
			left[i] = input[p + i];

		for (i = 0; i < rightEnd; i++)
			right[i] = input[q + i + 1];

		left[leftEnd] = Integer.MAX_VALUE;
		right[rightEnd] = Integer.MAX_VALUE;

		i = 0;
		j = 0;

		for (int k = p; k <= r; k++)
		{
			if (left[i] <= right[j])
				input[k] = left[i++];
			else
				input[k] = right[j++];
		}
	}
}