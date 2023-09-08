package org.delazeri;

import java.util.Scanner;

public class AccountChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();

        System.out.println("Please, enter with the account number: ");
        bankAccount.setNumber(scanner.nextInt());
        System.out.println("Please, enter with the agency number: ");
        scanner.nextLine();
        bankAccount.setAgency(scanner.nextLine());
        System.out.println("Now, what's your name? ");
        bankAccount.setClientName(scanner.nextLine());
        System.out.println("To finish, what's the balance of account? ");
        bankAccount.setBalance(scanner.nextBigDecimal());

        scanner.close();

        bankAccount.printWelcomeMessage();
    }
}