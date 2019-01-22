import static org.junit.Assert.*;

public class FibonacciGeneratorTest {

    @org.junit.Test
    public void getFib() {
        FibonacciGenerator fg = new FibonacciGenerator();
        long result = fg.getFib(5);
        assertEquals(5, result);
        result = fg.getFib(10);
        assertEquals(55, result);
    }
}