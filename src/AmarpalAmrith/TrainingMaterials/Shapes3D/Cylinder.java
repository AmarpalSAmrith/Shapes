package AmarpalAmrith.TrainingMaterials.Shapes3D;

import AmarpalAmrith.TrainingMaterials.Shapes2D.Circle;

public class Cylinder extends Prism {

    public Cylinder(double radius, double height, String colour) {
        super(new Circle(radius, colour), height);
    }
}
