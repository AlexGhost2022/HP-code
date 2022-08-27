package FinanceAppFinalTiket;

public class SavingManager {

      void saving(double goal, double moneyToday){

       double moneyTotal = 0;
       int dayCount = -1;

         while (moneyTotal <= goal){
             moneyTotal = moneyTotal + moneyToday;
             dayCount = dayCount +1;

         }
          System.out.println("Ура! Вы сможете накопить "+ goal + " за " + dayCount + " дней!");
      }
}
