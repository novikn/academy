package main.java.academy.homework1;

//Задание 1.
//
//        a) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
//        б) Распечатать последний символ строки. Используем метод String.charAt().
//        в) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
//        г) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
//        д) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//        e) Найти позицию подстроки “Java” в строке “I like Java!!!”.
//        ж) Заменить все символы “а” на “о”.
//        з) Преобразуйте строку к верхнему регистру.
//        и) Преобразуйте строку к нижнему регистру.
//        к) Вырезать строку Java c помощью метода String.substring().

//public class Classworkstr {
//    public static void main(String[] args) {
//       String str = "I like Java!!!";
//       process (str);
//    }
//
//    public static void process(String str) {
//        System.out.println(str.charAt(str.length()-1));//b
//        System.out.println(str.endsWith("!!!"));//c
//        System.out.println(str.startsWith("i like"));
//        System.out.println(str.contains("Java"));
//        System.out.println(str.indexOf("Java"));
//        System.out.println(str.replace('a','o'));
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());
//        System.out.println("Java".substring("Java".indexOf("Java"), "Java".length())); // задание к)
//    }
// String string = ("Object-oriented programming is a programming language model organized around objects rather than actions and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.");
//    String searchString ="Object-oriented programming".toLowerCase();
//    String indexString = searchString.toLowerCase();
//    StringBuilder sb = new StringBuilder(string);
//    int counterOOP = 0;
//    int indexOOP = 0;
//    while(indexOOP !=-1){
//    indexOOP=indexString.indexOf((searchString,indexOOP+1));
//    counterOOP ++;
//    }
//
//
//    int size = indexString.length();
//
//    int index = indexString.lastIndexOf(searchString);
//    int counter = 0;
//
//    while (index != -1){
//        sb.replace(index, index+size,"OOP")
//        index=indexString.lastIndexOf(searchString,index-1);
//
// System.out.println(sb);
//    //sb.replace()
//
//    }



