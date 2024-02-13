package behavioral.mediator;

public class Passenger {
  private String name;
  private FlightMediator mediator;

  public Passenger(String name, FlightMediator mediator) {
    this.name = name;
    this.mediator = mediator;
  }

  public void bookFlight(String flightNumber) {
    mediator.bookFlight(name, flightNumber);
  }

  public void queryFlightSchedule(String flightNumber) {
    mediator.queryFlightSchedule(flightNumber);
  }
}
