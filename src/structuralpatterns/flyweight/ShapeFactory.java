package structuralpatterns.flyweight;

import java.util.HashMap;

public class ShapeFactory {
    private static HashMap<String, Shape> shapes = new HashMap<>();

    public static Shape getShape(String type) {
        Shape shape = null;

        if(shapes.get(type) != null) {
            shape = shapes.get(type);
        } else {
            if(type.equals("circle")) {
                shape = new Circle();
            } else if(type.equals("rectangle")) {
                shape = new RectAngle();
            }

            shapes.put(type, shape);
        }
        return shape;
    }
}
