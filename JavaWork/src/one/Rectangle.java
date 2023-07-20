package one;

public class Rectangle extends Shape{

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.area();
	}
		void area(){
			int w=10;
			int h=20;
			int area=w*h;
			System.out.println("Area of rectangle="+area);
		}
	}


