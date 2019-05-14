package AmarpalAmrith.TrainingMaterials;

public class Circle {
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

    public double getCircumference() {
        return Math.PI * (radius * 2);
    }
    public String toString() {
        return "Radius = " + radius + "\nColour = " + colour;
    }
}
