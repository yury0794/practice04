package prob5;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double width, double height) {
		super(3);
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
		double area = width * height / 2;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter;
		double index = Math.sqrt(width * width + height * height);
		perimeter = width + height + index;
		return perimeter;
	}
}