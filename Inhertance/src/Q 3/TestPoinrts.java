package Points;

public class TestPoinrts {
	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3);
		System.out.println(p);
		float a[]=p.getXYZ();
		for(float i:a){
			System.out.println(i);
		}
		
		
	}
}
