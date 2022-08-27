package FinanceAppFinalTiket;

public class Converter {

   double rateUSD;
   double rateEUR;
   double rateJPY;

   Converter(double usd, double eur, double jpy){

       rateUSD = usd;
       rateEUR = eur;
       rateJPY = jpy;


   }void converter(double rubles, int currency){

       if(currency==1){
           System.out.println("Ваши сбережения в долларах " + rubles/rateUSD);
       }else if(currency==2){
           System.out.println("Ваши сбережения в евро " + rubles/rateEUR);
       }else if(currency==3){
           System.out.println("Ваши сбережения в иенах " + rubles/rateJPY);
       }else {
           System.out.println("Валюта не поддерживается!");
       }
    }


}
