//아래의 Point 클래스와 Rectangle 클래스에 내용 비교를 위한 equals 메소드를 각각 삽입하자
//그리고 정의한 equals 메소드의 확인을 위한 main 메소드도 직접 정의하자.

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