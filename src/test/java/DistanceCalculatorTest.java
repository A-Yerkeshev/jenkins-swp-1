import static org.junit.jupiter.api.Assertions.*;

class DistanceCalculatorTest {
    public void testCalculateDistance() {
        DistanceCalculator calculator = new DistanceCalculator();
        double[] point1 = { 0.0, 0.0 };
        double[] point2 = { 1.0, 1.0 };
        double expected = Math.sqrt(2);
        double actual = calculator.calculateDistance(point1, point2);
        assertEquals(expected, actual);
    }
}