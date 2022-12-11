package main.java.academy.homework1;

import java.util.Scanner;

public class Homework1_2 {
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in); // ctrl+shift+O на англ раскладке, чтобы появился Import сканнера
		System.out.println("Введите тип данных");
		String dataType = console.nextLine().toLowerCase();	//снижает регистр букв

		switch (dataType) {
		case "int":{
			System.out.println("Введите переменную");
			int variable = console.nextInt();
			System.out.println(String.format("Остаток от деления на 2 = %s", variable%2 ));
			break;}
		case "double":{
			System.out.println("Введите переменную");
			double variable = console.nextDouble();			
			System.out.println(String.format("70 процентов = %s", (variable)*0.7));
			break;}
		case "float":{
			System.out.println("Введите переменную");
			float variable = console.nextFloat();
			System.out.println(String.format("Квадрат числа = %s", variable*variable));
			break;}
		case "char":{
			System.out.println("Введите переменную");
			String variable = console.next();			
			System.out.println(String.format("charAt 0 %s", variable.charAt(0)));
			break;}
		case "string":{
			System.out.println("Введите переменную");
			String variable = console.next();
			System.out.println(String.format("Hello %s", variable));
			break;}
		default: System.out.println("Unsupported type");	
		
		
		console.close();
		}
		
	}
}
