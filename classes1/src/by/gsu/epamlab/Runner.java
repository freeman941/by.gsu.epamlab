package by.gsu.epamlab;
import by.gsu.epamlab.BusinessTrip;
public class Runner {

	

	public static void main(String[] args)  {
		BusinessTrip[] businessTrips = new BusinessTrip[] {
				new BusinessTrip("Erik Lehnsherr",5,30000),
				new BusinessTrip("Jean Grey", 10,45000 ),
				null,
				new BusinessTrip("James Howlett",13,33000),
				new BusinessTrip()		
		};
		for(BusinessTrip businessTrip:businessTrips)
		{
			if (businessTrip!=null)
			{
				 businessTrip.show();
				
			}
		
			
		}
		businessTrips[businessTrips.length-1].setTranport_expenses(60000);
		System.out.println("Duration="+(businessTrips[0].getNumber_of_days()+businessTrips[1].getNumber_of_days()));
		for(BusinessTrip businessTrip:businessTrips)
		{
			//if(businessTrip!=null)
			System.out.println(businessTrip);
		}
		

	}

}
