import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class HelloWorldTest {
    @Mock
    HelloWorldDB db;

    @InjectMocks
    HelloWorld mockHello;

    @Test
    public void greet_from_db() {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("first");
        arr.add("second");

        when(db.getDBNames()).thenReturn(arr);
        mockHello.greetFromDB(); // Notice elements from arr printed
    }
}