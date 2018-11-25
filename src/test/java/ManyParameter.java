import org.junit.Test;

public class ManyParameter {
    private static final double PARAMETER_1 = 0.1;
    private static final double PARAMETER_2 = 0.2;
    private static final double PARAMETER_3 = 0.3;
    private int logic = 50;

    @Test
    public void manyTest() {

        int a = 5;
        int b = 10;

        if (logic > 50) {
            getTest(a, b, PARAMETER_1);
        } else if (logic < 50) {
            getTest(a, b, PARAMETER_2);
        } else {
            getTest(a, b, PARAMETER_3);
        }
    }

    private double getTest(int a, int b, double c) {
        return a * b * c;
    }
}
