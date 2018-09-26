package BPoints;

public class MovablePoint extends Point {

	private float xSpeed;
	private float ySpeed;

	public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public MovablePoint(float xSpeed, float ySpeed) {
		super();
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public MovablePoint() {
		super();
	}

	public float getxSpeed() {
		return this.xSpeed;
	}

	public void setxSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}

	public float getySpeed() {
		return this.ySpeed;
	}

	public void setySpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}

	public void setSpeed(float xSpeed, float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public float[] getSpeed(){
		float a[]={this.xSpeed,this.ySpeed};
		return a;
	}
	
	public String toString(){
		return super.toString()+",speed=("+this.xSpeed+","+this.ySpeed+")";
	}
	public void move(){
		this.setXY(this.getX()+this.xSpeed, this.getY()+this.ySpeed);
	}

}
