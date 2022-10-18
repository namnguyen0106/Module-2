package lesson6.exercise1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor("Red");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(5);
        cylinder.setColor("Green");
        cylinder.setHeight(5);
        System.out.println(cylinder);
    }
}
