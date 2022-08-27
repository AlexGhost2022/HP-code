package FinanceAppFinalTiket;

public class DinnerAdvisor {

    void getAdvisor(double moneyBeforeSalary, int daysBeforeSalary){

        if(moneyBeforeSalary < 3000){
            System.out.println("Лучше поесть дома! Экономьте и вы дотянете до зарплаты!");
        }else if(moneyBeforeSalary < 10000){
            if(daysBeforeSalary < 10){
                System.out.println("Окей, пора в Макдак!");
            }else {
                System.out.println("Лучше поесть дома! Экономьте и вы дотянете до зарплаты!");
            }
        }else if(moneyBeforeSalary < 30000){
            if(daysBeforeSalary < 10){
                System.out.println("Неплохо! Прикупите долларов и поужинайте в классном месте!");
            }else {
                System.out.println("Окей, пора в Макдак!");
            }
        }else {
            if(daysBeforeSalary < 10){
                System.out.println("Отлично! Заказывайте крабов!");
            }else {
                System.out.println("Неплохо! Прикупите долларов и поужинайте в классном месте!");

            }
        }

    }
}
