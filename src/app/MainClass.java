package app;
import AtmPackage.Transaction;

import java.util.Scanner;


public class MainClass {

    public static void main(String[] args){
        Transaction transaction = new Transaction();
        Scanner input = new Scanner(System.in);
        char ch = 'y';

        do{
            transaction.display();
            transaction.switchCase();
            System.out.println("Do you want to continue Y or y for Yes , n or N for No");
            ch=input.next().charAt(0);
        }while((ch=='y' || ch=='Y'));
            System.out.println("Thank you for using this ATM");
            System.exit(0);


    }
}
