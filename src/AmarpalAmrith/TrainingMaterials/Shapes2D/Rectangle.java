package AmarpalAmrith.TrainingMaterials.Shapes2D;

import AmarpalAmrith.TrainingMaterials.ShapeTypes.TwoDimensionalShape;

public class Rectangle implements TwoDimensionalShape {
    private double length;
    private double width;
    private String colour;

    public Rectangle(double length, double width, String colour) {
        this.length = length;
        this.width = width;
        this.colour = colour;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getColour() {
        return colour;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return getType() +
                ":\nHeight = " + length +
                "\nWidth = " + width +
                "\nColour = " + colour;
    }
}
