public class Main {
    public static void main(String args[]){

        double[] array = new double[]{22.6, 14.3, -6.1, -1.13, 14.3, -19.25, 31.3,14.3};

        System.out.println("Maximum = " + LambdaAssignment.findMax.apply(array));
        System.out.println("Minimum = " + LambdaAssignment.findMin.apply(array));
        System.out.println("Sum     = " + LambdaAssignment.findSum.apply(array));
        System.out.println("Average = " + LambdaAssignment.findAvg.apply(array));
        ArrayProcessor arrayProcessorCounter = LambdaAssignment.counter(14.3);
        System.out.println("Count   = " + arrayProcessorCounter.apply(array));

    }


}