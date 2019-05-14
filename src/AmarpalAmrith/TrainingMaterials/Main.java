package AmarpalAmrith.TrainingMaterials;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20.0, 10.0, "Red");
        Circle circle = new Circle(50.0, "Orange");

        System.out.println("Rectangle:\n" + rectangle.toString() +"\n============");
        System.out.println("Circle:\n" + circle.toString() +"\n============");
    }
}
