package basicos;

import java.util.Scanner;

public class URI_1187 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String O = input.next();
		double soma = 0;
		for(int i=0;i<12;i++)
			for(int j=0;j<12;j++)
				if(j<=i || j+i>10)
					input.nextDouble();
				else
					soma += input.nextDouble();
		if(O.equals("S"))
			System.out.printf(String.format(java.util.Locale.US,"%.1f\n",soma));
		else
			System.out.printf(String.format(java.util.Locale.US,"%.1f\n",soma/30));
		
		input.close();
	}

}
