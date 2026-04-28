package org.lessons.java.snack;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Studente test = new Studente();
        System.out.println(test.getFullInfo());
        
        ContoBancario prova = new ContoBancario("abc");
        prova.putMoney(new BigDecimal(100));
        prova.getMoney();


    }
}
