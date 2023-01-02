package main.java.academy.homework3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Deal {

    private Customer customer;
    private Seller seller;
    private Product[] products = new Product[10];
    private final LocalDate deadLineDate;
    private int productCount = 0;

    public Deal() {
        this.deadLineDate = LocalDate.now().plusDays(10L);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Product[] getProducts() {
        return products;
    }

    public void addProduct(Product product){
        if (findProduct(product.name) > 0)
            products[findProduct(product.name)].quantity += product.quantity;
        else {
            products[productCount] = product;
            productCount += 1;
        }
    }

    public Boolean deleteProduct(String product){
        if (findProduct(product) < 0 ) return Boolean.FALSE;
        products[findProduct(product)].quantity = 0;
        return Boolean.TRUE;
    }

    private int findProduct(String productName){
        for (int i = 0; i < products.length; i++){
            if (products[i] != null && products[i].name.equals(productName)) return i;
        }
        return -1;
    }

    public Boolean closeDeal(){
        double totalCost = 0;
        for (int i = 0; i < products.length; i++){
            if (products[i] != null){
                totalCost += products[i].calcFinalPrice();
            }
        }
        if (customer.getMoney() >= totalCost ){
            customer.setMoney(customer.getMoney() - totalCost);
            seller.setMoney(seller.getMoney() + totalCost);
            return Boolean.TRUE;
        }
        else return Boolean.FALSE;
    }

    @Override
    public String toString() {
        return "Сделка: \n" +
                "Поупатель: " + customer +
                "\nПродавец: " + seller +
                "\nДата валидности: " + deadLineDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) +
                "\n Продукты в корзине: " + Arrays.toString(products);
    }
}
