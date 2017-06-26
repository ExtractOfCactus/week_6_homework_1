import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class BusTest {
  Bus bus;
  Person person;

  @Before
  public void before() {
    bus = new Bus();
    person = new Person();
  }

  @Test
  public void busStartsEmpty() {
    assertEquals(0, bus.passengerCount());
  }
}