package by.academy.lesson2.classwork;

public class Cat {
	int age;
	String nickname;
	private int money = 0;
	char initials;
	boolean isHomeAnimal;

	public void isHomeAnimal(boolean isHomeAnimal) {
		this.isHomeAnimal = isHomeAnimal;
	}

	public boolean getisHomeAnimal() {
		return this.isHomeAnimal;
	}

	public void setInitials(char initials) {
		this.initials = initials;
	}

	public char getInitials() {
		return this.initials;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getMoney() {
		return this.money;
	}

	public String getMoneystatus() {
		if (money == 0)
			return "у котика закончились денежки, котик плачет";
		else
			return String.valueOf(this.money);
	}

	public void grow() {
		age = age + 1;
		// this.age+= or age++
	}

	public void sleep() {
		System.out.println("кот спит");
	}

	public void eat() {
		System.out.println("кот  ест");
	}

	public void walk() {
		System.out.println("кот гуляет");
	}

	public Cat() {

	}

	public Cat(String name) {
		this.nickname = name;
		this.isHomeAnimal = true; // котик с кличкой бездомным не бывает))
	}
}
