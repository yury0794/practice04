package prob5;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		super(4);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		double area = width * height;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter;
		perimeter = width * 2 + height * 2;
		return perimeter;
	}

	public void resize(double rate) {
		setWidth(width * rate);
		setHeight(height * rate);
	}
}