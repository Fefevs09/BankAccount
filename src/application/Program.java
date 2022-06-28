package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account = new Account();

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.println("Is there na initial deposit (y/n)?");
        char answer = sc.next().charAt(0);
        if (answer == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number,holder,initialDeposit);
            account.deposit(initialDeposit);
        } else if (answer == 'n') {
            account = new Account(number, holder);

        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
        System.out.println("Update account data: ");
        System.out.println(account.toString());

        System.out.print("Enter a withdraw value: ");
        amount = sc.nextDouble();
        account.withdraw(amount);
        System.out.println("Update account data: ");
        System.out.println(account.toString());


        sc.close();
    }
}
