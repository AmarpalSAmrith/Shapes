package AmarpalAmrith.TrainingMaterials;

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
        return Math.PI * (radius * radius);
    }

    public double getPerimeter() {
        return Math.PI * (radius * 2);
    }
    public String toString() {
        return getType() + ":\n" + "Radius = " + radius + "\nColour = " + colour;
    }
}
