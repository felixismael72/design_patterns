package behavioral.mediator;

public class Airline {
  private FlightMediator mediator;

  public Airline(FlightMediator mediator) {
    this.mediator = mediator;
  }

  public void updateFlightSchedule(String flightNumber, String schedule) {
    mediator.updateFlightSchedule(flightNumber, schedule);
  }
}
