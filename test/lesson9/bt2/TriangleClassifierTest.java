package lesson9.bt2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    TriangleClassifier triangleClassifier = new TriangleClassifier();

    @Test
    @DisplayName("tam giác đều")
    void case1() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "tam giác đều";
        String actual = triangleClassifier.classify(a, b, c);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("tam giác cân")
    void case2() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "tam giác cân";
        String actual = triangleClassifier.classify(a, b, c);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("tam giác thường")
    void case3() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "tam giác thường";
        String actual = triangleClassifier.classify(a, b, c);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("không phải là tam giác")
    void case4() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "không phải là tam giác";
        String actual = triangleClassifier.classify(a, b, c);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("không phải là tam giác")
    void case5() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "không phải là tam giác";
        String actual = triangleClassifier.classify(a, b, c);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("không phải là tam giác")
    void case6() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "không phải là tam giác";
        String actual = triangleClassifier.classify(a, b, c);
        assertEquals(expected, actual);
    }

}