package com.thoughtworks;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 4;

        TriangleExercises triangleExercises = new TriangleExercises();

        System.out.println("easiestExerciseEver:");
        triangleExercises.easiestExerciseEver();
        System.out.println("\ndrawHorizontalLine:");
        triangleExercises.drawHorizontalLine(count);
        System.out.println("\ndrawVerticalLine:");
        triangleExercises.drawVerticalLine(count);
        System.out.println("\ndrawRightTriangle:");
        triangleExercises.drawRightTriangle(count);
    }
}
