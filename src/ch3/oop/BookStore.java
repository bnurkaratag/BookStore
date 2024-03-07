package ch3.oop;

public class BookStore {
    public static void main(String[] args) {
        Book[] books = { //kitap array
                new Book("Clean code", "Robert C.", 2008, 600),
                new Book("Effective Java", "Bloch", 2017, 1200)
        };
        System.out.println("\nKitaplar Eklendi!");

        Customer[] customers = {  //müşteri array
                new Customer("Beyza Nur Karatag", "bnurkaratag@gazi.edu.tr", 5000),
                new Customer("Gamze Cansız", "gmzcnsz@gazi.edu.tr", 3000)
        };
        System.out.println("\nMüşterileri Sisteme Başarıyla Eklendi!");

        String email = "bnurkaratag@gazi.edu.tr";
        Customer foundCustomer = null;
        for (Customer c : customers) {
            if (c.getEmail().equals(email)) {   //kitap array de gezin ,c yani arraydeki email ile email değerine eşit ise
                foundCustomer = c;
                break;
            }
        }
        if (foundCustomer == null) {
            throw new IllegalArgumentException("Müşteri Sistemde bulunamadı!");
        }
        String bookName="Effective Java";
        Book foundBook=null;
        for(Book b:books){// kayıtı kitap varsa
            if (b.getName().equals(bookName)){
                foundBook=b;
                break;
            }
        }
        if(foundBook==null){//kayıtlı kitap bulunamadı
            throw  new IllegalArgumentException("Kitap Sistemde Bulunamadı!");
        }
        try{
            foundCustomer.buyBook(foundBook.getPrice());
            System.out.println("Kitap başarıyla satın alındı!");

        }catch (IllegalArgumentException e){
            System.out.println("\n"+e.getMessage());
        }
        System.out.println("Bakiye: " +foundCustomer.getBalance());
    }
}