package homework3;

public class Seller extends Person{
    public  Seller (String name,int money){
        super(name, money);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getMoney() {
        return super.getMoney();
    }

    @Override
    public void setMoney(int money) {
        super.setMoney(money);
    }
}
