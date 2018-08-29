package com.thoughtworks;

public class DiamondExercises {
    private final int LAYOUT = 1;

    public void isoscelesLine(int n, int lines) {
        String output = "";
        for (int i = lines - n; i > 0; i--) {
            output += " ";
        }
        for (int i = 0; i < 2 * n - 1; i++) {
            output += "*";
        }
        System.out.println(output);
    }

    public void isoscelesTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            isoscelesLine(i, n);
        }
    }

    public void isoscelesTriangleWithName(int n) {
        for (int i = 1; i < n; i++) {
            isoscelesLine(i, n);
        }
        System.out.println("ThxNo");
    }

    public void diamond(int n) {
        isoscelesTriangle(n);
        isoscelesReverseTriangle(n - 1);
    }

    public void isoscelesReverseTriangle(int n) {
        for (int i = n; i > 0; --i) {
            isoscelesLine(i, n + LAYOUT);
        }
    }

    public void diamondWithName(int n) {
        isoscelesTriangleWithName(n);
        isoscelesReverseTriangle(n - 1);
    }
}
