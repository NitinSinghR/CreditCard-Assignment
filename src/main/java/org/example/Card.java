package org.example;

class Card extends CreditCard implements Cloneable {
    private String name;
    private String number;
    private String date;

    Card(String name, String number, String date) {
        this.name = name;
        this.number = number;
        this.date = date;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean compare(Card verify) {
        return this.number.equals(verify.number);
    }
}
