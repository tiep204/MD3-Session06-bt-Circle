package ra;

public class Circle {
    public double radius;
    public String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double area(){
        double pi = Math.PI;
        return pi*Math.pow(radius,2);
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public String displayData(){
        return "Bán kính : "
                +radius +"\n"
                +"Màu :"+color + "\n"
                +"diện tích: "+area()+"\n"
                + "chu vi: "+perimeter();
    }
}
