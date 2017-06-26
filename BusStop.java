public class BusStop {

  private Person[] queue;

  public BusStop() {
    this.queue = new Person[10];
  }

  public int queueCount() {
    int lengthOfQueue = 0;
    for (Person person : this.queue) {
      if (person != null) {
        lengthOfQueue++;
      }
    }
    return lengthOfQueue;
  }

  public void addPerson(Person person) {
    int index = queueCount();
    this.queue[index] = person;
  }
}