package studio7;

public class Rectanglee {

	private int length;
	private int width;

	public Rectanglee (int l, int w) {
		length = l;
		width = w;

	}

	public int getLength () {
		return length;
	}

	public int getWidth() {
		return width;
	}
	public int perimeter () {
		return 2*length + 2*width;
	}
	public int area() {
		return length * width;
	}
	public boolean isSquare() {
		if(length == width) {
			return true;
		}
		else {
			return false;
		}
	}

	
	public static void main(String[] args) {
		Rectanglee A = new Rectanglee(5,10);
		Rectanglee B = new Rectanglee(10,20);
		if(A.area() < B.area()) {
			System.out.println("Rectangle A is smaller than Rectangle B.");
		}
		else if(A.area() > B.area()) {
			System.out.println("Rectangle A is bigger than Rectangle B.");
		}
		else {
			System.out.println("Rectangle A is the same size as Rectangle B.");
		}

	}

}
