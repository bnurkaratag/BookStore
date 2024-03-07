package ch3.oop;

public class Book {
    private final String name;
    private final String author;
    private int publishYear;
    private double price;

    // constructor overloading
    //belirli parametrelerin eksik olması veya belirtilmemesi durumunda varsayılan değerler atanabilir
    //farklı parametrelerle sınıfın farklı özelliklerine
    public Book(String name,String author,int publishYear,double price){
        this.name=name;
        this.author=author;
        this.publishYear=publishYear;
        this.price=price;
    }
    public Book(String name,String author){
        this.name=name;
        this.author=author;
        this.price=0;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public  String getName(){
        return name;
    }
    public  String getAuthor(){
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }
    public double getPrice() {
        return price;
    }
}
