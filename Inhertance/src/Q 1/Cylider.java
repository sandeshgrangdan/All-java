package CircleAndCylinder;

public class Cylider extends Circle{
	private double height;

	public Cylider() {
		super();
		this.height=1.0;
	}

	public Cylider(double radius) {
		super(radius);
	}

	public Cylider(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public Cylider(double radius, String color, double height) {
		super(radius, color);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume(){
		return super.getArea()*this.height;
	}
	@Override
	public double getArea(){
		return 2*Math.PI*this.getRadius()*(this.getRadius()+this.height);
	}

}
