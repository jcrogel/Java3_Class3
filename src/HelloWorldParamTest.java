import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.runners.Parameterized.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import java.util.Arrays;


@RunWith(Parameterized.class)
public class HelloWorldParamTest {
    private String name = "";

    @Parameterized.Parameters
    public static Iterable names() {
        return Arrays.asList(new Object[] {
                "John", "Paul",
                "George", "Ringo"
        });
    }

    public HelloWorldParamTest(String name){
        this.name = name;
    }

    @Test
    public void greet() {
        HelloWorld hw = new HelloWorld();
        assertThat(hw.greet(this.name), containsString(name));
    }
}
