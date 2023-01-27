package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Scanner sc = new Scanner(System.in);
        Logger l= Logger.getLogger("com.api.jar");

        l.info("Enter the credit card name:");
        String name = sc.next();
        l.info("Enter the credit card number:");
        int number = sc.nextInt();
        l.info("enter the expiration date");
        String date=sc.next();
        l.info("Enter the credit card number to check:");
        int number1 = sc.nextInt();

        Card c=new Card(name,number,date);
        Card c1=(Card)c.clone();

        String e=equals(number,number1);
        l.info(e);
    }
    public static String equals(int number, int number1){
        if(number == number1){
            return "true";
        }
        else{
            return "false";
        }
    }
}
class Card extends Main implements Cloneable{
    private String name;
    private int number;
    private String date;

    Card(String name,int number,String date){
        this.name=name;
        this.number=number;
        this.date=date;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}