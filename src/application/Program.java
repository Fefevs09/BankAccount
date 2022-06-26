package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int actNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String actName = sc.nextLine();
        double balance;
        Account account = new Account();


        System.out.println("Is there na initial deposit (y/n)?");
        char answer = sc.next().charAt(0);
        if (answer == 'y' ) {
            System.out.print("Enter initial deposit value:");
            balance = sc.nextDouble();
        account.actDeposit(balance);
        } else if (answer == 'n') {
            System.out.println();
        }

        System.out.println("Account data:");
        System.out.println(account.toString());

        System.out.print("Enter a deposit value: ");
        balance = sc.nextDouble();

        System.out.println("Update account data: ");
        System.out.println(account.toString());

        System.out.print("Enter a withdraw value: ");
        balance = sc.nextDouble();
        account.actwithdraw(balance);
        System.out.println("Update account data: ");
        System.out.println(account.toString());


        sc.close();
    }
}
