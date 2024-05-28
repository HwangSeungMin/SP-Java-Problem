package week2day5;

class Shape {
    protected String color;
    protected int demension;

    protected Shape(String color){
        this.color = color;
        this.demension = 2;
    }

    public double calculateArea(){
        return 0.0;
    }

    protected void printInfo(){
        System.out.println("도형의 색상: "+ color);
        System.out.println("도형의 면적: "+ calculateArea());
    }

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
