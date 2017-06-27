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

  @Test
  public void busStopIsFull() {
    for (int i = 0; i < 10; i++) {
      busStop.addPerson(person);
    }
    assertEquals(true, busStop.isBusStopFull());
  }

  @Test
  public void cannotAddPersonWhenBusStopIsFull() {
    for (int i = 0; i < 15; i++) {
      busStop.addPerson(person);
    }
    assertEquals(10, busStop.queueCount());
  }

  @Test
  public void canRemoveOnePersonFromQueue() {
    for (int i = 0; i < 10; i++) {
      busStop.addPerson(person);
    }
    busStop.removePerson();
    assertEquals(9, busStop.queueCount());
  }

  @Test 
  public void busStopCanAddPassengersToBus() {
    busStop.addPerson(person);
    busStop.addPassengerToBus(bus, person);
    assertEquals(1, bus.passengerCount());
    assertEquals(0, busStop.queueCount());
  }
}