package CodingTestSuhaeng;

public class suhaeng12 {

	public static void main(String[] args) {
		Rectangle t1 = new Rectangle(1,1,3,3);
		t1.showRectangle();
		System.out.println("�簢���� �ѷ�: "+t1.getRound());
		System.out.println("�簢���� ����: "+t1.getArea());
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
		System.out.println("�簢���� ��ǥ�� ���� �� (" + x1 +","+y1+")");
		System.out.println("�簢���� ��ǥ�� ������ �Ʒ� (" + x2 +","+y2+")");
	}
	int getRound() {
		return 2*(x2-x1) + 2*(y2-y1);
	}
	int getArea() {
		return (x2-x1)*(y2-y1);
	}
}