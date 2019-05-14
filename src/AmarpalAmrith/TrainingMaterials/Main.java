package AmarpalAmrith.TrainingMaterials;

import static AmarpalAmrith.TrainingMaterials.Utilities.*;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20.0, 10.0, "Red");
        Circle circle = new Circle(50.0, "Orange");
        separatedMsg("Rectangle:\n" + rectangle.toString());
        separatedMsg("Circle:\n" + circle.toString());
    }
}
