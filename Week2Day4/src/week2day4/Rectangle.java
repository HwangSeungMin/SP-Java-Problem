package week2day4;

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    public void printRectangleInfo() {
        super.printInfo();
        System.out.println("사각형의 가로길이:"+this.width);
        System.out.println("사각형의 세로길이:"+this.height);
    }
}
