
public class Main {

	public static void main(String[] args) {

		ShapeCache shapeCache = new ShapeCache();

		shapeCache.loadCache();

		Shape shape = shapeCache.getShape("1");

		System.out.println("Shape " + shape.getType());

	}

}
