public class DistanceCalculator {
    public double calculateDistance(double[] point1, double[] point2) {
        double x = point2[0] - point1[0];
        double y = point2[1] - point1[1];
        return Math.sqrt(x * x + y * y);
    }
}
