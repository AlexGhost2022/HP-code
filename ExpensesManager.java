package FinanceAppFinalTiket;

public class ExpensesManager {

    double[]expenses;

    ExpensesManager(){

        expenses = new double[7];
    }double saveExpense(double moneyBeforeSalary, int day, double expense){

        moneyBeforeSalary = moneyBeforeSalary - expense;
        expenses[day - 1] = expenses[day - 1] + expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях "+ moneyBeforeSalary);
        if(moneyBeforeSalary < 1000){
            System.out.println("На вашем счете осталось совсем немного! Стоить начать экономить!");
        }return moneyBeforeSalary;

    }void printAllExpenses(){
     for(int i =0; i < expenses.length; i++){
         System.out.println("День " + (i + 1) + " потрачено " + expenses[i] + " рублей!");
     }

    }double findMaxExpenses(){
        double maxExpenses = 0;
        for (int i = 0; i < expenses.length; i++){
            if(expenses[i] > maxExpenses){
            maxExpenses = expenses[i];
            }
        }return maxExpenses;

    }

}