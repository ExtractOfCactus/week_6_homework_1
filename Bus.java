public class Bus {

  private Person[] passengers;

  public Bus() {
    this.passengers = new Person[18];
  }

  public int passengerCount() {
    int numberOfPassengers = 0;
    for (Person person : this.passengers) {
      if (person != null) {
        numberOfPassengers++;
      }
    }
    return numberOfPassengers;
  }
}