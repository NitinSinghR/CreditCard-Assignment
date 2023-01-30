package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Scanner sc = new Scanner(System.in);
        Logger l= Logger.getLogger("com.api.jar");

        int number;
        l.info("Enter the credit card name:");
        String name = sc.next();
        l.info("Enter the credit card number:");
        number = Integer.parseInt(sc.next());
        l.info("enter the expiration date");
        String date=sc.next();

        Card c=new Card(name,number,date);
        Card c1=(Card)c.clone();

        int number1=0;
        l.info("Enter the credit card name:");
        String name1 = sc.next();
        l.info("Enter the credit card number:");
        number1 = Integer.parseInt(sc.next());
        l.info("enter the expiration date");
        String date1=sc.next();

        Card c2=new Card(name1,number1,date1);

        String e=""+c1.compare(c2);
        l.info(e);
    }
}
class Card extends Main implements Cloneable {
    private String name;
    private int number;
    private String date;

    Card(String name, int number, String date) {
        this.name = name;
        this.number = number;
        this.date = date;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean compare(Card verify) {
        return this.number == verify.number;
    }
}