package week2day5;

class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        super("기본색");
        this.radius = radius;

    }

    @Override
    public double calculateArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getRadius(){
        return this.radius;
    }
    public double calculateDiameter(){
        return this.radius * 2;
    }
    @Override
    public double calculatePerimeter(){
        return this.radius * 2 * Math.PI;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

}
