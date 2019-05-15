package AmarpalAmrith.TrainingMaterials.Shapes2D;

import AmarpalAmrith.TrainingMaterials.ShapeTypes.TwoDimensionalShape;

public class Circle implements TwoDimensionalShape {

    private double radius;
    private String colour;

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public double getPerimeter() {
        return Math.PI * Math.pow(radius,2);
    }

    public String toString() {
        return getType() + ":\n" + "Radius = " + radius + "\nColour = " + colour;
    }
}
