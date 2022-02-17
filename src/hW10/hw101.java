package hW10;

import java.util.Scanner;

public class hw101 {

	public static void main(String[] args) {
		
		int sum = 0;
		int[] num = new int[5];
		Scanner r = new Scanner(System.in);
		num[0] = r.nextInt();
		num[1] = r.nextInt();
		num[2] = r.nextInt();
		num[3] = r.nextInt();
		num[4] = r.nextInt();

		for (int i = 0; i < num.length; i++) {
			
			sum += num[i];
			System.out.print(sum + " ");

		}
		System.out.print("----------------------------------------------------");

		int[][] numbers = { { 1, 2, 3, 4, 5 }, { 33, 55, 45, 67, 67 } };
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {

				sum += numbers[i][j];
				System.out.print(sum + " ");
			}
		}
	}



	}


