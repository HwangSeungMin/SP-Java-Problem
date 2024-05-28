package week2day4;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle("빨강", 4.0);
        Shape shape2 = new Rectangle("파랑", 3.0, 4.0);

        System.out.println("Shape1 면접 크키: " + shape1.getArea());
        System.out.println("Shape2 면접 크키: " + shape2.getArea());

        System.out.println("------------------------");

        if (shape1 instanceof Circle) {
            Circle circle = (Circle) shape1;
            circle.printCircleInfo();
        }

        System.out.println("------------------------");

        if (shape2 instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape2;
            rectangle.printRectangleInfo();
        }
    }
}