package AmarpalAmrith.TrainingMaterials.Shapes2D;

import AmarpalAmrith.TrainingMaterials.ShapeTypes.TwoDimensionalShape;

public class Triangle implements TwoDimensionalShape {

    private double A;
    private double B;
    private double C;
    private String colour;

    public Triangle(double A, double B, double C, String colour) {
        if (!(A<B+C && B<A+C && C<A+B)) {
            throw new IllegalArgumentException("Does not comply with the rules when creating a triangle!");
        }
        this.A = A;
        this.B = B;
        this.C = C;
        this.colour = colour;
    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public double getC() {
        return C;
    }

    @Override
    public double getPerimeter() {
        return A + B + C;
    }

    @Override
    public double getArea() {
        return Math.sqrt(getPerimeter() *
                (A + B - C) *
                (A + C - B) *
                (B + C - A))
                / 4;
    }

    @Override
    public String getColour() {
        return colour;
    }
}
