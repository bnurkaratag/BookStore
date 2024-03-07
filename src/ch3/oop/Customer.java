package ch3.oop;

public class Customer {
    private String name;
    private String email;
    private  double balance;
    public Customer(String name,String email){
        this(name,email,0);
    }
    public Customer(String name,String email,double balance){
        this.name=name;
        this.email=email;
        this.balance=balance;
    }
    public  String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void buyBook(double price){
        if (balance< price){
            throw new IllegalArgumentException("Yetersiz Bakiye! ");
        }
        balance-=price;    //bakiyeden kitabın fiyatı düşürdük kitabı satın aldırdığımız metot

    }

}
