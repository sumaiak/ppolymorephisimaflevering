package Task4;

import java.util.ArrayList;

public class ShapeBuilder implements Shape {
    ArrayList<Shape>shapes = new ArrayList<>();


    void addShapes( Shape s ){
        shapes.add(s);





    }

    @Override
    public double getArea() {
        return 0;
    }
}
