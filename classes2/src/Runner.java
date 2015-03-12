import by.gsu.epamlab.Material;
import by.gsu.epamlab.Subject;


public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Subject wire=new Subject(new Material("steel",7850.0),"wire",0.03);
	      System.out.println(wire.toString());
	      wire.setMaterial(new Material("copper",8500.0));
	      System.out.println("The wire mass is "+wire.getMass()+" kg.");
	}

}
