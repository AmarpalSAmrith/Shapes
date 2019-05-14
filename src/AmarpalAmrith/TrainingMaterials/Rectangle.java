package AmarpalAmrith.TrainingMaterials;

public class Rectangle {
    private double height;
    private double width;
    private String colour;

    public Rectangle(double height, double width, String colour) {
        this.height = height;
        this.width = width;
        this.colour = colour;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getColour() {
        return colour;
    }

    public double getArea() {
        return height * width;
    }

    public double getPermimeter() {
        return (height * 2) + (width * 2);
    }
    public String toString() {
        return "Height = " + height + "\nWidth = " + width + "\nColour = " + colour;
    }
}
