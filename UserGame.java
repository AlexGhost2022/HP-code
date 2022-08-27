package FinanceAppFinalTiket;

import java.util.Random;
import java.util.Scanner;

public class UserGame {

    Scanner scanner = new Scanner(System.in);
    int randomInput = new Random().nextInt(10);

    void game(){
        System.out.println("Я загадал число от 0 до 10");
        System.out.println("Ваш ход: ");
        int userInput = -1;

        while (userInput != randomInput){
            userInput =scanner.nextInt();
            if(userInput > randomInput){
                System.out.println("Меньше");
            }
            if(userInput < randomInput){
                System.out.println("Больше");
            }
        }
        System.out.println("Вы великолепны! Именно это я и загадал!");

    }

}
