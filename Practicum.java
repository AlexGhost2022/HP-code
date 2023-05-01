package FinanceAppFinalTiket;

import java.util.Scanner;

public class Practicum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();
        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        Converter converter = new Converter(78.5, 80.05, 0.78);
        DinnerAdvisor dinnerAdvisor = new DinnerAdvisor();
        ExpensesManager expensesManager = new ExpensesManager();
        SavingManager savingManager = new SavingManager();
        UserGame userGame = new UserGame();
        UserRating userRating = new UserRating();

        while (true){
            printMenu();
            int command = scanner.nextInt();
            if(command==1){
                System.out.println("Ваши сбережения " + moneyBeforeSalary + " RUB");
                System.out.println("В какую валюту хотите конвертировать? 1-USD, 2-EUR, 3-JPY");
                int currency = scanner.nextInt();
                converter.converter(moneyBeforeSalary,currency);

            }else if(command==2){
                dinnerAdvisor.getAdvisor(moneyBeforeSalary,daysBeforeSalary);
            }else if(command==3){
                System.out.println("За какой день хотите ввести трату? 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС");
                int day = scanner.nextInt();
                System.out.println("Введите размер траты: ");
                double expense = scanner.nextDouble();
                moneyBeforeSalary = expensesManager.saveExpense(moneyBeforeSalary,day,expense);
            }else if(command==4){
               expensesManager.printAllExpenses();
            }else if(command==5){
                System.out.println("Самая большая трата на этой неделе составила "+ expensesManager.findMaxExpenses() + " рублей!");
            }else if(command==6){
                System.out.println("Финансовая цель?");
                double goal = scanner.nextDouble();
                System.out.println("Сколько готовы откладывать ежедневно?");
                double moneyToday = scanner.nextDouble();
                savingManager.saving(goal,moneyToday);
            }else if(command==7){
                userGame.game();
            }else if(command==0){
                System.out.println("Хотите оценить приложение перед выходом?  1 - Да, 2 - Нет");
                int commandRating = scanner.nextInt();
                if(commandRating==1){
                    userRating.rating();
                    break;
                }else if(commandRating==2){
                    System.out.println("До свидания!");
                    break;
                }else {
                    System.out.println("Такой команды пока нет!");
                }

            }

        }




    }public static void printMenu(){
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Конвертировать валюту");
        System.out.println("2 - Получить совет");
        System.out.println("3 - Ввести трату");
        System.out.println("4 - Показать траты за неделю");
        System.out.println("5 - Показать самую большую сумму расходов за неделю");
        System.out.println("6 - Накопить деньги");
        System.out.println("7 - Сыграть в игру с компьютером");
        System.out.println("0 - Выход");

    }
}
