package AtmPackage;


import java.util.Scanner;

public class ATM {
    protected int money;


    ATM(){this.money=100;}

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    protected void dash(){
        System.out.println("-----------------");
    }
    public void display(){
        System.out.println("ATM");
        dash();
        System.out.println("1:Withdraw " + "\n2:Deposit " + "\n3:Exit");
        dash();

    }



}
