package BPoints;

public class PointMoveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovablePoint mp = new MovablePoint(2,3,10,10);
		System.out.println(mp.toString());
		mp.move();
		System.out.println(mp.toString());
	}

}
