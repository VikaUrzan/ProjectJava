package Lesson2;

public class Main {
    public static void main(String[] args) {
        int [] array = {-6, 2, 7, 4, 1 };
        MathOperation math = new MathOperation();
        System.out.println(math.sum(array));
        System.out.println(math.min(array));
        System.out.println(math.max(array));
        System.out.println(math.maxPositive(array));
        System.out.println(math.sum(array));
        System.out.println(math.multiplication(array));
        System.out.println(math.modulus(array));
        System.out.println(math.secondLargest(array));
    }
}