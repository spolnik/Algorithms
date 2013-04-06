import java.util.*;
import java.io.*;

public class SelectionSort {
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
		
		int[] result = SelectionSort(input);
		
		StringBuilder sb = new StringBuilder();		
		String prefix = "";
		
		for (int item : result) {
		  sb.append(prefix);
		  prefix = ";";
		  sb.append(item);
		}
		
		System.out.println(sb.toString());
	}
	
	private static int[] SelectionSort(int[] input) {
		int n = input.length;
		
		for (int j = 0; j < n - 1; j++)
		{
			int smallest = j;
			for (int i = j + 1; i < n; i++)
			{
				if (input[i] < input[smallest])
					smallest = i;
			}
			
			int temp = input[j];
			input[j] = input[smallest];
			input[smallest] = temp;
		}
		
		return input;
	}
}