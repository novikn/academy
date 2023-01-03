package main.java.academy.homework3;

import java.time.LocalDate;
import java.util.Scanner;

public class Application {
    private static Scanner sc = new Scanner(System.in);
    private static Deal deal;
    private static Seller seller;
    private static Customer customer;

    public static void main(String[] args) {

        while (Boolean.TRUE) {
            printMenu();
            String answer = sc.next();
            switch (answer) {
                case "1": {
                    beginDeal();
                    break;
                }
                case "2": {
                    setSeller();
                    break;
                }
                case "3": {
                    setCustomer();
                    break;
                }
                case "4": {
                    productsMenu();
                    break;
                }
                case "5": {
                    dealInfo();
                    break;
                }
                case "6": {
                    finishDeal();
                    break;
                }
                case "0": {
                    return;
                }
                default:
                    System.out.println("Неизвестная команда");
            }
        }
    }

    private static void printMenu() {
        System.out.println("Добро пожаловать!");
        System.out.println("1 - Для начала сделки");
        System.out.println("2 - Для задания продавца");
        System.out.println("3 - Для задания покупателя");
        System.out.println("4 - Для входа в меню товаров");
        System.out.println("5 - Для просмотра данных сделки");
        System.out.println("6 - Для завершения сделки");
        System.out.println("0 - Для выхода");
    }

    private static void printProductMenu() {
        System.out.println("Меню продуктов:");
        System.out.println("1 - Чтобы добавить в корзину Хлеб");
        System.out.println("2 - Чтобы добавить в корзину Вино");
        System.out.println("3 - Чтобы добавить в корзину Сыр");
        System.out.println("4 - Чтобы удалить из корзины Продукт");
        System.out.println("0 - Для выхода");
    }

    private static void beginDeal() {
        System.out.println("Начинаем сделку! ");
        deal = new Deal();
        System.out.println();
        System.out.println("Необходимо задать продавца и покупателя!");
        System.out.println();

    }

    private static void setSeller() {
        System.out.println("Введите данные продавца:");
        System.out.println("Введите имя продавца: ");
        String name = sc.next();
        System.out.println("Введите сумму наличных у продавца: ");
        double money = sc.nextDouble();
        seller = new Seller(name, money);
        System.out.println("Введите ДР продавца: ");
        String birthDay = sc.next();
        if (DateValidator.matchesSlashDate(birthDay)
                || DateValidator.matchesDashDate(birthDay)) {
            LocalDate birth = DateValidator.getLocalDate(birthDay);
            seller.setDateOfBirth(birth);
        } else System.out.println("Некорректная дата рождения!");
        deal.setSeller(seller);
    }

    private static void setCustomer() {
        System.out.println("Введите данные покупателя:");
        System.out.println("Введите имя покупателя: ");
        String name = sc.next();
        System.out.println("Введите сумму наличных у покупателя: ");
        double money = sc.nextDouble();
        customer = new Customer(name, money);
        deal.setCustomer(customer);
    }

    private static void productsMenu() {
        while (Boolean.TRUE) {
            printProductMenu();
            String answer = sc.next();
            switch (answer) {
                case "1": {addBread(); break;}
                case "2": {addWine(); break;}
                case "3": {addCheese(); break;}
                case "4": {deleteProduct(); break;}
                case "0": {
                    return;
                }
                default: System.out.println("Неизвестная команда");
            }
        }
    }

    private static void addBread() {
        System.out.println("Введите наименование: ");
        String name = sc.next();
        System.out.println("Введите количество: ");
        double quantity = sc.nextDouble();
        System.out.println("Введите стоимость: ");
        double price = sc.nextDouble();
        System.out.println("Введите тип: ");
        String type = sc.next();
        Product bread = new Bread(name, type, price, quantity);
        deal.addProduct(bread);
    }

    private static void addWine() {
        System.out.println("Введите наименование: ");
        String name = sc.next();
        System.out.println("Введите количество: ");
        double quantity = sc.nextDouble();
        System.out.println("Введите стоимость: ");
        double price = sc.nextDouble();
        System.out.println("Введите объем: ");
        double volume = sc.nextDouble();
        Product wine = new Wine(name, volume, price, quantity);
        deal.addProduct(wine);
    }

    private static void addCheese() {
        System.out.println("Введите наименование: ");
        String name = sc.next();
        System.out.println("Введите количество: ");
        double quantity = sc.nextDouble();
        System.out.println("Введите стоимость: ");
        double price = sc.nextDouble();
        System.out.println("Введите вид: ");
        String type = sc.next();
        Product cheese = new Cheese(name, type, price, quantity);
        deal.addProduct(cheese);
    }

    private static void deleteProduct() {
        System.out.println("Введите наименование продукта: ");
        String productName = sc.next();
        if (deal.deleteProduct(productName).equals(Boolean.TRUE)) System.out.println("Продукт удален успешно!");
        else System.out.println("Такого продукта нет в корзине");
    }

    private static void dealInfo() {
        System.out.println(deal);
    }

    private static void finishDeal() {
        if (deal.closeDeal()) {
            double total = 0;
            System.out.println("Сделка завершена успешно!");
            System.out.println("Чек: ");

            for (int i = 0; i < deal.getProducts().length; i++){
                if (deal.getProducts()[i] != null){
                System.out.printf("Продукт: %s Количество %s Стоимость %s Скидка %.2f%n",
                        deal.getProducts()[i].name,
                        deal.getProducts()[i].quantity,
                        deal.getProducts()[i].calcPrice(),
                        deal.getProducts()[i].calcFinalPrice());
                total += deal.getProducts()[i].calcFinalPrice();}
            }
            System.out.printf("Итого %.2f%n", total);

            deal = new Deal();
        } else {
            System.out.println("У покупателя недостаточно денег для завершения сделки!");
        }

    }


}
