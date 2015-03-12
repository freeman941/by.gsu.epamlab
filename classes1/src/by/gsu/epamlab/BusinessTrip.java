package by.gsu.epamlab;

public class BusinessTrip {
public static final int RATE=100000;
private String account;
private int number_of_days;
private int tranport_expenses;
public BusinessTrip() {
	super();
	// TODO Auto-generated constructor stub
}
public BusinessTrip(String account, int number_of_days, int tranport_expenses) {
	super();
	this.account = account;
	this.number_of_days = number_of_days;
	this.tranport_expenses = tranport_expenses;
}
public String getAccount() {
	return account;
}
public void setAccount(String account) {
	this.account = account;
}
public int getNumber_of_days() {
	return number_of_days;
}
public void setNumber_of_days(int number_of_days) {
	this.number_of_days = number_of_days;
}
public int getTranport_expenses() {
	return tranport_expenses;
}
public void setTranport_expenses(int tranport_expenses) {
	this.tranport_expenses = tranport_expenses;
}
public int getTotal(){
	
	return tranport_expenses+RATE*number_of_days;
}

	

public void show(){

	System.out.println("rate="+RATE+";\n"+"account="+getAccount()+";\n"+"days="+getNumber_of_days()+";\n"+"transport expenses="+getTranport_expenses()+";\n"+"total cost="+getTotal());
	
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return account+";"+tranport_expenses+";"+number_of_days+";"+getTotal();
}

}
