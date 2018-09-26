package Points;

public class Point3D extends Point2D{
	private float z;

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public Point3D(float x, float y, float z) {
		super(x, y);
		this.z = z;
	}

	public Point3D() {
		super();
		this.z=0.0f;
	}
	public void setXYZ(float x,float y,float z){
		super.setXY(x, y);
		this.z=z;
	}
	public float[] getXYZ(){
		float a1[]=super.getXY();
		float a[]={a1[0],a1[1],this.z};
		return a;
	}

	@Override
	public String toString() {
		return "("+this.getX()+","+this.getY()+","+this.z+")";
	}
	
	
	
}
