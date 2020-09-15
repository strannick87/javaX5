package lesson4;

public class Main {
    public static void main(String[] args) {
        double[] arr = new double[20];
        for (int i=0;i< arr.length;i++){
            arr[i] = (int)(100 * Math.random()) -50;
        }
        ArrayMath.Pair p = ArrayMath.minmax(arr);
        System.out.println("min = "+p.getFirst()+" "+" max = "+p.getSecond());
    }
}

class ArrayMath {
    public static class Pair {
        private double first;
        private double second;
        public Pair(double first, double second) {
            this.first = first;
            this.second = second;
        }
        public double getFirst() {
            return first;
        }
        public double getSecond() {
            return second;
        }
    }
    public static Pair minmax(double[] values) {
        double min = 0;
        double max = 0;
        for (double d : values) {
            if (min > d) {
                min = d;
            }
            if (max < d) {
                max = d;
            }
        }
        return new Pair(min, max);
    }
}