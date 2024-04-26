package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pilih;
        do {
            System.out.println("----------------------------------------");
            System.out.println("UTP A CINEMA ISRI");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Pick your choise : ");
            pilih = in.nextInt();

            switch (pilih) {
                case 1:
                System.out.println("----------------------------------------");
                System.out.println("Login to our System");
                System.out.println("Email");
                    break;
                case 2:
                    System.out.println("----------------------------------------");
                    System.out.println("Register to our system");
                    System.out.println("Fullname");
                    break;
                default:
                    break;
            }

        } while (pilih != 3);
    }
}
