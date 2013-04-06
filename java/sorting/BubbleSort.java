import java.util.*;
import java.io.*;

public class BubbleSort {
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
		
		int[] result = BubbleSort(input);
		
		StringBuilder sb = new StringBuilder();		
		String prefix = "";
		
		for (int item : result) {
		  sb.append(prefix);
		  prefix = ";";
		  sb.append(item);
		}
		
		System.out.println(sb.toString());
	}
	
	private static int[] BubbleSort(int[] input) {
		int n = input.length;
		for (int i = 0; i < n; i++)
		{
			for (int j = input.length - 1; j > i; j--)
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