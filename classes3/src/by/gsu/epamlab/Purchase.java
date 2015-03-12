package by.gsu.epamlab;

public class Purchase implements Comparable<Purchase> 
{
	private WeekDay week_Day;
	private final String COMMODITY_NAME="ammunition";
	private final int PRICE=300000;
	private int number_Of_Purchases;
	public Purchase() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Purchase(WeekDay week_Day, int number_Of_Purchases)
	{
		super();
		this.week_Day = week_Day;
		this.number_Of_Purchases = number_Of_Purchases;
	}
	public WeekDay getWeek_Day() 
	{
		return week_Day;
	}
	public void setWeek_Day(WeekDay week_Day)
	{
		this.week_Day = week_Day;
	}
	public String getCommodity_Name() 
	{
		return COMMODITY_NAME;
	}
	
	public int getPrice()
	{
		return PRICE;
	}

	public int getNumber_Of_Purchases()
	{
		return number_Of_Purchases;
	}
	public void setNumber_Of_Purchases(int number_Of_Purchases)
	{
		this.number_Of_Purchases = number_Of_Purchases;
	}
	public int getCost()
	{
		return PRICE*number_Of_Purchases;
	}
	
	
	public int compareTo(Purchase purchase)
	{ 
        if(number_Of_Purchases < purchase.number_Of_Purchases)
        {
            return -1;
        }
        else   if(number_Of_Purchases>purchase.number_Of_Purchases)
        {
        	return 1;
        }	
        return 0;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return number_Of_Purchases+";"+week_Day;
	}
}
