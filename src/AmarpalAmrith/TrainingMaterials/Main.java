package AmarpalAmrith.TrainingMaterials;

import AmarpalAmrith.TrainingMaterials.Shapes2D.*;
import AmarpalAmrith.TrainingMaterials.Shapes3D.*;
import static AmarpalAmrith.TrainingMaterials.Utilities.*;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(20.0, 10.0, "Red");
        Circle circle = new Circle(50.0, "Orange");
        Square square = new Square(10.0, "Blue");
        Prism prism = new Prism(square,50.0);
        Sphere sphere = new Sphere(10.0,"White");
        Triangle triangle = new Triangle(5, 13, 12, "Brown");
        Prism toblerone = new Prism(triangle, 20.0);

        separatedMsg(rectangle.prettyPrint());
        separatedMsg(circle.prettyPrint());
        separatedMsg(square.prettyPrint());
        separatedMsg(prism.prettyPrint());
        separatedMsg(sphere.prettyPrint());
        separatedMsg(triangle.prettyPrint());
        separatedMsg(toblerone.prettyPrint());
    }
}
