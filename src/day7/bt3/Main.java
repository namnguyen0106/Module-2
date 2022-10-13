package day7.bt3;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(5f, 10f);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint(5f, 5f, 2f, 1f);
        System.out.println("Trước khi di chuyển: " + movablePoint);
        movablePoint.move();
        System.out.println("Sau khi di chuyển: " + movablePoint);
    }
}
