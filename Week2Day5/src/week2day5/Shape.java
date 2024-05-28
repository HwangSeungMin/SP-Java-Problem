package week2day5;

abstract class Shape {
    protected String color;
    protected int demension;

    protected Shape(String color){
        this.color = color;
        this.demension = 2;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDimension() {
        return demension;
    }
}
