package com.thoughtworks;

public class TriangleExercises {
    public void easiestExerciseEver() {
        System.out.println("*");
    }

    public void drawHorizontalLine(int n) {
        String output = "";
        for (int i = 0; i < n; i++) {
            output += "*";
        }
        System.out.println(output);
    }

    public void drawVerticalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public void drawRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            drawHorizontalLine(i);
        }
    }
}
