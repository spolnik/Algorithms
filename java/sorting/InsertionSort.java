import java.util.*;
import java.io.*;

public class InsertionSort {
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
		
		int[] result = InsertionSort(input);
		
		for (int item : result)
			System.out.print(item + ";");
			
		System.out.println();
	}
	
	private static int[] InsertionSort(int[] input) {
		for (int j = 1; j < input.length; j++) {
			int key = input[j];
			
			int i = j - 1;
			while (i > -1 && input[i] > key) {
				input[i + 1] = input[i];
				i--;
			}
			
			input[i+1] = key;
		}
		
		return input;
	}
}