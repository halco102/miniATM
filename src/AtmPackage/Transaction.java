package AtmPackage;

import java.util.Scanner;

public class Transaction extends ATM{

    private int userMoney;
    private boolean start = true;
    public Transaction(){}

    public boolean getStart(){
        return this.start;
    }

    public void switchCase(){
        int input;
        Scanner in = new Scanner(System.in);
        System.out.println("Input :");
        input=in.nextInt();

        switch (input){
            case 1:{
                System.out.println("Set money");
                userMoney=in.nextInt();
                withdraw(this.userMoney);
                if(this.start==true) {
                    System.out.println("You now have " + getMoney() + " $ ");
                }
                break;
            }
            case 2:{
                System.out.println("Set money");
                userMoney=in.nextInt();
                deposit(this.userMoney);
                if(this.start==true) {
                    System.out.println("You now have " + getMoney() + " $ ");
                }
                break;
            }
            case 3:{
                System.out.println(toString());
                break;
            }
            case 4:{
                System.out.println("Thank you for using this ATM");
                System.exit(0);
                break;
            }
            default:{
                System.out.println("Choose from 1 - 4 ");
                break;
            }

        }

    }

    @Override
    public String toString() {
        return "Balance : " + this.money;
    }

    @Override
        public void display(){
            System.out.println("ATM");
            dash();
            System.out.println("1:Withdraw " + "\n2:Deposit " + "\n3:Mini Statement " +"\n4:Exit");
            dash();

        }


    private boolean checkWithdraw(int money){
        if(this.money<money){
            this.start=false;
            return false;
        }

            return true;
    }

    private boolean checkDeposit(int money){
        if(money>1000){
            this.start = false;
            return false;
        }
            this.start=true;
            return true;

    }

    public void deposit(int money){

        if(checkDeposit(money)==true){
            this.money+=money;
        }else
        System.out.println("You cannot deposit more than 1000 $");

    }


    public void withdraw(int money){

        if(checkWithdraw(money)==true){
            this.money-=money;
        }else
            System.out.println("You dont have enough money in the bank!");

        }
}
