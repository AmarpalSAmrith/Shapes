package AmarpalAmrith.TrainingMaterials.Shapes3D;

import AmarpalAmrith.TrainingMaterials.Shapes2D.Rectangle;

public class Cuboid extends Prism {

    public Cuboid(double width, double height, double depth, String colour) {
        super(new Rectangle(width, height, colour), depth);
    }

}