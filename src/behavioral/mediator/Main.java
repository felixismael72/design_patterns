package behavioral.mediator;

public class Main {
  public static void main(String[] args) {
    FlightMediator mediator = new FlightBookingSystem();

    Passenger passenger1 = new Passenger("Alice", mediator);
    Passenger passenger2 = new Passenger("Bob", mediator);

    Airline airline = new Airline(mediator);

    airline.updateFlightSchedule("ABC123", "Departure: 10:00 AM, Arrival: 12:00 PM");

    passenger1.bookFlight("ABC123");
    passenger2.queryFlightSchedule("ABC123");
  }
}
