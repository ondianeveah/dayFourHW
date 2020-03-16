package scannerDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Hi, what is your name?");
        String name = userInput.nextLine();

        System.out.println("What is your number?");
        long userNumber = userInput.nextInt();

        System.out.println("well hit me up then"  + "you look good");
    }
}
