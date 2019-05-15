package AmarpalAmrith.TrainingMaterials.Shapes2D;

import AmarpalAmrith.TrainingMaterials.ShapeTypes.TwoDimensionalShape;

public class Triangle implements TwoDimensionalShape {

    private double a;
    private double b;
    private double c;
    private String colour;

    public Triangle(double a, double b, double c, String colour) {
        if (!(a < b + c && b < a + c && c < a + b)) {
            throw new IllegalArgumentException("Does not comply with the rules when creating a triangle!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.colour = colour;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public String getColour() {
        return colour;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        return Math.sqrt((a + b + c) *
                (a + b - c) *
                (a + c - b) *
                (b + c - a))
                / 4;
    }

    public String getRightAngledTriangle() {
        if(isInBounds((a * a) + (b * b), (c * c)) ||
               isInBounds((a * a) + (c * c), (b * b))||
               isInBounds((b * b) + (c * c), (a * a))) {
            return "This is a Right Angled Triangle! 😊";
        } else{
            return "This isn't a Right Angled Triangle 😏";
        }
    }

    private boolean isInBounds(double result, double target) {
        return Math.abs(result - target) < 1e-6;
    }

    public String toString() {
        return getType() +
                ":\nSmallest Side = " + a +
                "\nMedium Side = " + b +
                "\nLongest Side = " + c +
                "\nPermimeter = " + getPerimeter() +
                "\nArea = " + getArea() +
                "\n" + getRightAngledTriangle();
    }
}
