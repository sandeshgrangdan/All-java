package Persons;

public class Staff extends Person{
	private String school;
	private double pay;
	public Staff(String school, String adress, String school2, double pay) {
		super(school, adress);
		school = school2;
		this.pay = pay;
	}
	public String getschool() {
		return school;
	}
	public void setschool(String school) {
		this.school = school;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	public String toString(){
		return "Staff["+super.toString()+",School="+this.school+",pay="+this.pay+"]";
	}

}
