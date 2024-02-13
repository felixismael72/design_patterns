package behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class FlightBookingSystem implements FlightMediator {
  private Map<String, String> flightSchedule;

  public FlightBookingSystem() {
    this.flightSchedule = new HashMap<>();
  }

  @Override
  public void bookFlight(String passengerName, String flightNumber) {
    System.out.println(passengerName + " booked flight " + flightNumber);
  }

  @Override
  public void queryFlightSchedule(String flightNumber) {
    String schedule = flightSchedule.getOrDefault(flightNumber, "Flight not found");
    System.out.println("Flight " + flightNumber + " schedule: " + schedule);
  }

  @Override
  public void updateFlightSchedule(String flightNumber, String schedule) {
    flightSchedule.put(flightNumber, schedule);
  }
}
