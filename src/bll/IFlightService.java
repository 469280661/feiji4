package bll;

import com.bean.FlightInfo;

import java.util.Set;

public interface IFlightService {
    void insertFlight(FlightInfo flightInfo);
    Set<FlightInfo> getAllFlight();
    FlightInfo getFlightVyDepartureCity(String departureCity);
    FlightInfo getFlightByArriveCity(String arriveCity);
    FlightInfo getFlightVyDepartureDate(String departureDate);
    void updateFlight(FlightInfo flightInfo);
}
