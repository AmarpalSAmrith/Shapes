package AmarpalAmrith.TrainingMaterials;

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
        return (length * 2) + (width * 2);
    }
    public String toString() {
        return getType() + ":\n" + "Height = " + length + "\nWidth = " + width + "\nColour = " + colour;
    }
}
