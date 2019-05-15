package AmarpalAmrith.TrainingMaterials.Shapes3D;

import AmarpalAmrith.TrainingMaterials.ShapeTypes.ThreeDimensionalShape;
import AmarpalAmrith.TrainingMaterials.ShapeTypes.TwoDimensionalShape;
import AmarpalAmrith.TrainingMaterials.Utilities;

public class Prism implements ThreeDimensionalShape {

    private TwoDimensionalShape base;
    private double height;

    public TwoDimensionalShape getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public Prism(TwoDimensionalShape base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getSurfaceArea() {
        return base.getArea() * 2 + base.getPerimeter() * height;
    }

    @Override
    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String getColour() {
        return base.getColour();
    }

    @Override
    public String getType() {
        return base.getType() + " based " + getClass().getSimpleName();
    }

    @Override
    public String prettyPrint() {
        return getType() +
                "\n" + base.prettyPrint() +
                "\n" +Utilities.getEqualsSigns(getClass().getSimpleName()) +
                "\n" + getClass().getSimpleName() +
                "\nHeight = " + height +
                "\nColour = " + getColour();
    }
}
