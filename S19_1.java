//�Ʒ��� Point Ŭ������ Rectangle Ŭ������ ���� �񱳸� ���� equals �޼ҵ带 ���� ��������
//�׸��� ������ equals �޼ҵ��� Ȯ���� ���� main �޼ҵ嵵 ���� ��������.

package may0511;
class Point{
	private int xPos;
	private int yPos;
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	@Override
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(this.xPos == p.xPos && this.yPos == p.yPos) {
			return true;
		}
		else
			return false;
	}
}


class Rectangle {
	private Point upperLeft;
	private Point lowerRight;
	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}
	@Override
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle)obj;
		if(this.upperLeft.equals(r.upperLeft) && this.lowerRight.equals(r.lowerRight)) {
			return true;
		}
		else
			return false;
	}
}

public class S19_1 {
	public static void main(String[] args) {
		Point a1 = new Point(1,2);
		Point a2 = new Point(1,2);
		Point a3 = new Point(3,5);
	}
}