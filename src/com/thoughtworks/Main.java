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

        DiamondExercises diamondExercises = new DiamondExercises();

        System.out.println("\nisoscelesTriangle:");
        diamondExercises.isoscelesTriangle(count);
        System.out.println("\ndiamond:");
        diamondExercises.diamond(count);
        System.out.println("\ndiamondWithName:");
        diamondExercises.diamondWithName(count);

        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println("\nFizzBuzz:");
        fizzBuzz.fizzBuzz();

        PrimeFactorsExercises primeFactorsExercises = new PrimeFactorsExercises();
        System.out.println("\nPrimeFactors:");
        primeFactorsExercises.generate(147);
    }
}
