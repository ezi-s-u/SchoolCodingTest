package CodingTestSuhaeng;

public class suhaeng12 {

	public static void main(String[] args) {
		Rectangle t1 = new Rectangle(1,1,3,3);
		t1.showRectangle();
		System.out.pritnln("�簢���� �ѷ�: "+t1.getRound());
		System.out.pritnln("�簢���� ����: "+t1.getArea());
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
}