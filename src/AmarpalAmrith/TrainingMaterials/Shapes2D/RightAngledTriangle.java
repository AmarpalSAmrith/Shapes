package AmarpalAmrith.TrainingMaterials.Shapes2D;

public class RightAngledTriangle {

    private RightAngledTriangle() {
    }

    public static Triangle withShortSides(double a, double b, String colour) {
        return new Triangle(a, b, Math.sqrt(a * a + b * b), colour);
    }

    public static Triangle withLongAndShortSides(double b, double c, String colour) {
        return new Triangle(Math.sqrt((c * c) - (b * b)), b, c, colour);
    }
}
