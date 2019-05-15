package AmarpalAmrith.TrainingMaterials;

import AmarpalAmrith.TrainingMaterials.Shapes3D.Prism;
import AmarpalAmrith.TrainingMaterials.Shapes2D.Circle;
import AmarpalAmrith.TrainingMaterials.Shapes2D.Rectangle;
import AmarpalAmrith.TrainingMaterials.Shapes2D.Square;
import AmarpalAmrith.TrainingMaterials.Shapes3D.Sphere;

import static AmarpalAmrith.TrainingMaterials.Utilities.*;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20.0, 10.0, "Red");
        Circle circle = new Circle(50.0, "Orange");
        Square square = new Square(10.0, "Blue");
        Prism prism = new Prism(square,50.0,"Lilac");
        Sphere sphere = new Sphere(10.0,"White");
        separatedMsg(rectangle.prettyPrint());
        separatedMsg(circle.prettyPrint());
        separatedMsg(square.prettyPrint());
        separatedMsg(prism.prettyPrint());
        separatedMsg(sphere.prettyPrint());
    }
}
