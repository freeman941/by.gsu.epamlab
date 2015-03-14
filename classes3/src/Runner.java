import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;
import by.gsu.epamlab.Purchase;
import by.gsu.epamlab.WeekDay;

public class Runner {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int PURCHASE_NUMBER;
		 Purchase[] purchases=null;
       Scanner sc=null;
       try{   
    	   sc=new Scanner(new FileReader("src/in.txt"));
    	   PURCHASE_NUMBER = sc.nextInt();
    	   purchases = new Purchase[PURCHASE_NUMBER];
    	   for(int i=0; i<PURCHASE_NUMBER; i++)
    	   {
    		  int aday =sc.nextInt();
    		  int number = sc.nextInt();
    		  WeekDay day = WeekDay.values()[aday];
    		  purchases[i] = new Purchase(day,number);   		        
    	   }
       }
       catch(FileNotFoundException e)
       {
    	   System.err.println("File not found");
       }
       finally
       {
    	   if(sc!=null){
    	   sc.close();}
       } 
       Purchase.SHOW(purchases);
       double meanCost=0.00;
       double mondayCost=0;
       String dayMax=null;
       for(Purchase purchase:purchases)
       {
    	   
    	    meanCost+=purchase.getCost()/purchases.length;
    	    
    	   if(purchase.getWeek_Day()==WeekDay.MONDAY)
    	   {
    		   mondayCost+=purchase.getCost();
    	   }
    	   
    	   int maxPurchase=0;
    	   if(purchase.getNumberOfPurchases()>maxPurchase)
    	   {
    		  maxPurchase=purchase.getNumberOfPurchases();
    		   dayMax=purchase.getWeek_Day().toString();
    	   }    
       }
       System.out.println("Mean cost="+meanCost+";\n"+"Cost of Monday purchases="+mondayCost+";\n"+"Day with  max purchase:"+dayMax);
       Arrays.sort(purchases);
       Purchase.SHOW(purchases);
      int index= Arrays.binarySearch(purchases, new Purchase(null,5) );
      if (index<0)
      {
    	  System.out.println("Requested element not found");
      }
      else
      {
      System.out.println("Requested element is:" +purchases[index]);
      }   
 }

}
