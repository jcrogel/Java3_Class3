import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PassByTest {
    @org.junit.Test
    public void passByReference() {
        PassBy pb = new PassBy();
        pb.value = 10;
        pb.passByReference(pb);
        System.out.println("Uno");
        assertEquals(11, pb.value);
    }

    @org.junit.Test
    public void _passByValue() {
        PassBy pb = new PassBy();
        pb.value = 10;
        pb.passByValue(pb.value);
        System.out.println("Dos");
        assertEquals(10, pb.value);
    }

    @org.junit.Test
    public void testWithMocks(){

    }
}