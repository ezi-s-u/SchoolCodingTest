package CodingTestSuhaeng;

public class suhaeng12 {

	public static void main(String[] args) {
		Rectangle t1 = new Rectangle(1,1,3,3);
		t1.showRectangle();
		//System.out.pritnln("사각형의 둘레: "+t1.getRound());
		//System.out.pritnln("사각형의 넓이: "+t1.getArea());
	}

}

class Rectangle {
	int x1, y1, x2, y2;
	Rectangle(int a, int b, int c, int d){
		x1 = a;
		y1 = b;
		x2 = c;
		y2 = d;
	}
	void showRectangle() {
		System.out.println("사각형의 좌표는 왼쪽 위 (" + x1 +","+y1+")");
		System.out.println("사각형의 좌표는 오른쪽 아래 (" + x2 +","+y2+")");
	}
}