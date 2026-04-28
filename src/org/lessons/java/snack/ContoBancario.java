package org.lessons.java.snack;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContoBancario {
    Scanner in=new Scanner(System.in);
    private String account;
    private BigDecimal balance;

    public ContoBancario(String account,BigDecimal balance){
        this.account=account;
        this.balance=balance.setScale(2,RoundingMode.DOWN);
    }
    public ContoBancario(String account){
        this.account=account;
        this.balance=new BigDecimal(0);
    }

    //GETTER & SETTER
    public String getAccount(){
        return this.account;
    }
    public BigDecimal getBalance(){
        return this.balance;
    }

    //
    public BigDecimal getMoney(){
        System.out.printf("Saldo attuale : %.2f%n",this.balance);
        System.out.print("Quanto desideri prelevare? : ");
        BigDecimal tmp = in.nextBigDecimal().setScale(2,RoundingMode.DOWN);
        if(tmp.compareTo(this.balance)>0){
            System.out.println("Fondi insufficienti");
            return null;
        }else{
            this.balance=this.balance.subtract(tmp).setScale(2,RoundingMode.DOWN);
            System.out.printf("Operazione andata a buon fine%nSaldo attuale : %.2f%n",this.balance);
            return tmp;
        }
    }

    public void putMoney(BigDecimal money){
        if(money!=null&&money.compareTo(BigDecimal.ZERO)>0){
            this.balance=this.balance.add(money).setScale(2,RoundingMode.DOWN);
        }
    }
}
