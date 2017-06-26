import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;


public class BusStopTest {
  Bus bus;
  Person person;
  BusStop busStop;

  @Before
  public void before() {
    bus = new Bus();
    person = new Person();
    busStop = new BusStop();
  }

  @Test
  public void queueStartsEmpty() {
    assertEquals(0, busStop.queueCount());
  }

  @Test
  public void canAddPersonToQueue() {
    busStop.addPerson(person);
    assertEquals(1, busStop.queueCount());
  }
}