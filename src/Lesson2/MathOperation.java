package Lesson2;

public class MathOperation {

    public int sum(int[] array) {
        int sum = 0;
        int i;

        for (i=0; i < array.length; i++)
            sum +=array[i];

        return sum;

    }

    public int min(int[] array) {
        int min = array[0];

        for (int i=1; i < array.length; i++) {

            if (array[i] < min)
                min = array[i];
        }

        return min;
    }

    public int max(int[] array) {
        int max = array[0];

        for (int i=0; i < array.length; i++) {

            if (array[i] > max)
                max = array[i];
        }

        return max;
    }

    public long maxPositive(int[] array) {
        long maxPositive = array[0];

        for (int i=0; i < array.length; i++) {

            if (array[i] < 0);
            else
                maxPositive = array[i];

        }
        return maxPositive;
    }

    public int multiplication(int array[]) {
        int multiplication = 1;

        for (int i=0; i < array.length; i++) {
            multiplication = multiplication * array[i];
        }
        return multiplication;
    }

    public double modulus(int[] array) {
        double firstElement = array[0];
        double lastElement = array[array.length-1];

        return firstElement/lastElement;
    }

    public int secondLargest(int array[]) {
        boolean Sorted = false;
        int buf;

        while (!Sorted) {
            Sorted = true;
            for (int i=0; i < array.length-1; i++) {

                if (array[i] > array[i+1]) {
                    Sorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        return array[array.length-2];

    }

}