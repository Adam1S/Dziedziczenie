package com.company;

public class Main {

    public static void main(String[] args) {
        Tire tire=new Tire("Dunlop", "V129", 123, 1, 15, 195);

        ExhaustPart exPart=new ExhaustPart("Meyle", "Audi 80", 1235, 1, true );
        System.out.println(exPart.modelName);

    }
}
