using System;
using System.IO;

public class Program
{
	public static void Main(string[] args)
	{
		var inputPath = args[0];
		var outputPath = args[1];
		
		using (var inputReader = new StreamReader(inputPath))
		using (var outputReader = new StreamReader(outputPath))
		{
			if (inputReader.ReadLine().Equals(outputReader.ReadLine()))
				Console.WriteLine("PASS");
			else
				Console.WriteLine("FAIL");
		}
	}
}