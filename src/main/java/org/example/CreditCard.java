package org.example;

import java.util.*;
import java.util.logging.*;

public class CreditCard {

    public static void main(String[] args) throws CloneNotSupportedException {

        Scanner sc = new Scanner(System.in);
        Logger l= Logger.getLogger("com.api.jar");

        l.info("Enter the credit card name:");
        String name = sc.next();
        l.info("Enter the credit card number:");
        String number = sc.next();
        l.info("enter the expiration date");
        String date=sc.next();

        Card c=new Card(name,number,date);
        Card c1=(Card)c.clone();

        l.info("Enter the credit card name:");
        String name1 = sc.next();
        l.info("Enter the credit card number:");
        String number1 = sc.next();
        l.info("enter the expiration date");
        String date1=sc.next();

        Card c2=new Card(name1,number1,date1);

        String e=""+c1.compare(c2);
        l.info(e);
    }
}
