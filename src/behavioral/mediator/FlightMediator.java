package behavioral.mediator;

public interface FlightMediator {
  void bookFlight(String passengerName, String flightNumber);

  void queryFlightSchedule(String flightNumber);

  void updateFlightSchedule(String flightNumber, String schedule);
}
