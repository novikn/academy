package main.java.academy.homework1;

import java.util.Scanner;

public class Homework1_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите сумму покупки: ");
		int order = sc.nextInt();

		System.out.println("Введите возраст покупателя: ");
		int age = sc.nextInt();

		if (order < 100)
			System.out.println(String.format("Ваша скидка 5 процентов, к оплате %s", ((double) order * 0.95)));
		if (order >= 100 & order < 200)

			System.out.println(String.format("Ваша скидка 7 процентов, к оплате %s", ((double) order * 0.93)));

		if (order >= 200 && order < 300 && age > 18)

			System.out.println(String.format("Ваша скидка 16 процентов, к оплате %s", ((double) order * 0.84)));
		else
			System.out.println(String.format("Ваша скидка 9 процентов, к оплате %s", ((double) order * 0.91)));
		if (order >= 300 & order < 400)

			System.out.println(String.format("Ваша скидка 15 процентов, к оплате %s", ((double) order * 0.85)));

		if (order >= 400)

			System.out.println(String.format("Ваша скидка 20 процентов, к оплате %s", ((double) order * 0.80)));

		
		
		sc.close();
	
	
	
	
	
	
	
	}
}