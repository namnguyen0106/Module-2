package day10.bt2;

public class TriangleClassifier {

    public final String SCALENE = "tam giác thường";
    public final String ISOSCELES = "tam giác cân";
    public final String EQUILATERAL = "tam giác đều";
    public final String NOT_A_TRIANGLE = "không phải là tam giác";

    public String classify(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return SCALENE;
        }
        if (a > b + c) {
            return NOT_A_TRIANGLE;
        } else if (a == b && b == c) {
            return EQUILATERAL;
        } else if (a == b) {
            return ISOSCELES;
        } else {
            return SCALENE;
        }
    }

}