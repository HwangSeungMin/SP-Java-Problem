package week2day5;

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("기본색");
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }

    public void printRectangleInfo() {
        System.out.println("사각형의 가로길이:"+this.width);
        System.out.println("사각형의 세로길이:"+this.height);
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double calculateDiagonal(){
       return Math.sqrt(this.width*this.width +this.height*this.height);
    }

    @Override
    public double calculatePerimeter(){
        return 2*this.width+2*this.height;
    }
}
