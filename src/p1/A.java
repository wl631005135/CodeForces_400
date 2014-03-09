package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		int lines = Integer.parseInt(scanner.next());
		
		for(int i = 0; i < lines; ++i)
		{
			String input = scanner.next();
			process(input);
		}
	}

	private static void process(String input) {
		// TODO Auto-generated method stub
		
		if(!input.contains("X"))
		{
			System.out.println(0);
			return;
		}
		
		List<String> result = new ArrayList<String>();
		
		for(int a = 1; a <= 12; ++a)
		{
			for(int b = 1; b <= 12; ++b)
			{
				if(a * b == 12)
				{
					if(pr(input, b))
					{
						result.add(""+a+"x"+b);
					}
				}
				
			}
		}
		StringBuffer sb = new StringBuffer();
		sb.append(result.size());
		for(String s:result)
		{
			sb.append(" ");
			sb.append(s);
		}
		System.out.println(sb.toString());
	}

	private static boolean pr(String input, int b) {
		
		for(int i = 0; i < b; ++i)
		{
			boolean bFound = true;
			for(int j = i; j < 12; j = j + b)
			{
				if(input.charAt(j) != 'X')
				{
					bFound = false;
				}
			}
			
			if(bFound)
			{
				return true;
			}
		}
		
		return false;
	}


}
