package prob5;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Rectangle(5, 6);
		shapes[1] = new RectTriangle(6, 2);

		for (Shape shape : shapes) {
			System.out.println("area : " + shape.getArea());
			System.out.println("perimeter : " + shape.getPerimeter());

			if (shape instanceof Resizable) {
				Resizable resizable = (Resizable) shape;
				resizable.resize(0.5);
				System.out.println("area : " + shape.getArea());
				System.out.println("perimeter : " + shape.getPerimeter());
			}
		}
	}
}