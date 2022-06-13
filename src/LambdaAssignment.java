import java.util.Arrays;
import java.util.stream.DoubleStream;

public class LambdaAssignment {
    /*Maximum value from the given array */
    public static final ArrayProcessor findMax = array ->  DoubleStream.of(array).max().getAsDouble();

    /*Minimum value from the given array */
    public static final ArrayProcessor findMin = array -> DoubleStream.of(array).min().getAsDouble();

    /*Sum of the given array */
    public static final ArrayProcessor findSum = array -> DoubleStream.of(array).sum();

    /*Average of the given array */
    public static final ArrayProcessor findAvg = array -> DoubleStream.of(array).average().getAsDouble();

    /*Total count of a given value that occurs in the array */
    public static ArrayProcessor counter( double value ) {
        return (array) -> DoubleStream.of(array).filter(v -> v == value).count();
    }
}
