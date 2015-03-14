package by.gsu.epamlab;

public class Purchase implements Comparable<Purchase> 
{
	private WeekDay week_Day;
	public static final String COMMODITY_NAME="Ammunition";
	public static final int PRICE=300000;
	private int numberOfPurchases;
	public Purchase() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Purchase(WeekDay week_Day, int numberOfPurchases)
	{
		super();
		this.week_Day = week_Day;
		this.numberOfPurchases = numberOfPurchases;
	}
	public WeekDay getWeek_Day() 
	{
		return week_Day;
	}
	public void setWeek_Day(WeekDay week_Day)
	{
		this.week_Day = week_Day;
	}

	public int getNumberOfPurchases()
	{
		return numberOfPurchases;
	}
	public void setNumberOfPurchases(int numberOfPurchases)
	{
		this.numberOfPurchases = numberOfPurchases;
	}
	public int getCost()
	{
		return PRICE*numberOfPurchases;
	}
	
	
	public int compareTo(Purchase purchase)
	{ 
        if(numberOfPurchases < purchase.numberOfPurchases)
        {
            return -1;
        }
        else   if(numberOfPurchases>purchase.numberOfPurchases)
        {
        	return 1;
        }	
        return 0;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return numberOfPurchases+";"+week_Day+";"+getCost()+";";
	}
	 public static void SHOW(Purchase[] purchases)
     {
		 if (purchases.length>0)
	   {
    	 System.out.println("Name:"+Purchase.COMMODITY_NAME+";"+"Price="+Purchase.PRICE);
         for (Purchase purchase:purchases)
         {
         System.out.println(purchase);
         }
	   }  
     }
}
