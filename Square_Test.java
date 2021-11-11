package Class;

class Square {
	int height;
	int width;
	
	Square(int he, int wi) {
		height = he;
		width = wi;
	}
	
	int round() {
		return (2*height) + (2*width);
	}
	
	int area() {
		return height * width;
	}
}

public class Square_Test {

	public static void main(String[] args) {
		Square S1 = new Square((int)(Math.random()*10+1), (int)(Math.random()*10+1));
		
		System.out.println("세로의 길이가 " + S1.width + "고, 가로의 길이가 " + S1.height + "인 사각형의  둘레 : " + S1.round());
		System.out.println("세로의 길이가 " + S1.width + "고, 가로의 길이가 " + S1.height + "인 사각형의  넓이 : " + S1.area());
	}

}
