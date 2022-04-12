package com.jap.masterychallenge1;

import java.util.Scanner;

public class SmartTravelForex {


    public static double convertGivenCurrencyIntoDesiredCurrency(int sourceCurrency, int targetCurrency, double amountToBeConverted) {
    	double result;
    	float cur[]={0.67f,74.43f,94.5f,85.3f,20.25f};
    	double source=cur[sourceCurrency-1];
    	double target=cur[targetCurrency-1];
    	
    	result = (source* amountToBeConverted)/target;
    	
    	
          return result;
    }
   
    public static void displayForexDetails() {
    	System.out.println("\n"
    			+ "        1 Japanese Yen (JPY) = 0.67 Indian Rupee\n"
    			+ "        2 US Dollar (USD) =74.43 Indian Rupee\n"
    			+ "        3 British Pound Sterling (GBP) = 94.5 Indian Rupee\n"
    			+ "        4 Euro (EUR) = 85.3  Indian Rupee\n"
    			+ "        5 Arab Emirates Dirham (AED) = 20.25 Indian Rupee\n"
    			+ "");
    
    	String x[] ={"JPY","USD","GBP","EUR","AED"};
    	float cur[]={0.67f,74.43f,94.5f,85.3f,20.25f};
    	float temp;
    	System.out.println("\t"+1+"\t"+10+"\t"+20+"\t"+50+"\t"+100);
    	
    for(int i=0;i<5;i++)
    {
    for(int j=0;j<5;j++)
    {
    if(j==0)
    {
    System.out.print(x[i]+"\t"+cur[i]+"\t");
    
    }
    if(j==1)
    {
    temp=cur[i]*10;
    System.out.print(temp+"\t");
    } 
    if(j==2)
    {
    temp=cur[i]*20;
    System.out.print(temp+"\t");
    }
     if(j==3)
    {
    temp=cur[i]*50;
    System.out.print(temp+"\t");
    }
     if(j==4)
    {
    temp=cur[i]*100;
    System.out.print(temp+"\t");
    }
    }
    System.out.print("\n");
    }
    
    
      }
  


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayForexDetails();
        int INR;
        int source = 0;
        int target = 0;
        double amountToBeConverted = 0;
        System.out.println("Do you wish to check conversion rates today : (y/n) ");
        char choice = sc.next().charAt(0);
        if (choice == 'y') {
            System.out.println("Exchange Rate of currency can be done for \n 1. JPY \n 2. EUR \n 3. GBP \n 4. USD \n 5. AED ");
            System.out.println("Enter the source currency(Currency I have) : ");
            // Accept the source currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
            source = sc.nextInt();
            System.out.println("Enter the target currency(Currency I want) : ");
            // Accept the target currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
            target = sc.nextInt();
            System.out.println("Enter the amount to be converted : ");
            //Accept the amount to be converted
            amountToBeConverted = sc.nextDouble();
            // Display the amount converted
            System.out.println("The converted exchange rate is : " + convertGivenCurrencyIntoDesiredCurrency(source, target, amountToBeConverted));
        } else {
            System.out.println("Thanks for checking into currency convertor");
        }
    }

}
