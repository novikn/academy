package main.java.academy.class7;

  public class Phone {
    int number;
    String model;
    double weight;

    public Phone() {
        this.number = 1727835;
        this.model = "Samsung";
        this.weight = 1.2;
    }
    public Phone(int number, String model, double weight){
        this(number,model);
         this.weight = weight;
    }
       public Phone(int number, String model) {
           this();
           this.number = number;
           this.model = model;
       }
            public void receiveCall(String name){
                System.out.println("Звонит"+ name);
                }
      public void receiveCall(String name,int numberIn){
          System.out.println("Звонит"+ name + numberIn);

      }

             public int getNumber(){
               return number;
             }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
      static void sendMessages (int... array) {
          for (int a : array) {
              System.out.println ("Номер телефона для отправки сообщения: "+ a );
          }
}}




