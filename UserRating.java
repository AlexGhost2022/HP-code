package FinanceAppFinalTiket;

import java.util.Scanner;

public class UserRating {

    Scanner scanner = new Scanner(System.in);

    void rating(){
        while (true){
            System.out.println("Оцените приложение от 1 до 5");
            int userInputRating = scanner.nextInt();
            if(userInputRating==1){
                System.out.println("Будем улучшать!");
                break;
            }if(userInputRating==2){
                System.out.println("Есть куда расти!");
                break;
            }if(userInputRating==3){
                System.out.println("Спасибо! Будем улучшать!");
                break;
            }if(userInputRating==4){
                System.out.println("Неплохо! Спасибо!");
                break;
            }if(userInputRating==5){
                System.out.println("Отлично! Спасибо за высокую оценку!");
                break;
            }
            System.out.println("Оценка должна быть от 1 до 5!");
        }

        //System.out.println("Оценка должна быть от 1 до 5!");

      //  System.out.println("Оценка должна быть от 1 до 5!");
    }//System.out.println("Оценка должна быть от 1 до 5!");
}
