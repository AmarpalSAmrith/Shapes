package AmarpalAmrith.TrainingMaterials.Shapes3D;

import AmarpalAmrith.TrainingMaterials.ShapeTypes.ThreeDimensionalShape;

public class Sphere implements ThreeDimensionalShape {

    private double radius;
    private String colour;

    public Sphere(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String prettyPrint() {
        return getType() +
                "\nRadius = " + radius +
                "\nColour = " + colour +
                "\nVolume = " + getVolume()+
                "\nSurface Area = " + getSurfaceArea();
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * (radius * radius);
    }

    @Override
    public double getVolume() {
        return (4 / 3) * Math.PI * (radius * radius * radius);
    }
}
