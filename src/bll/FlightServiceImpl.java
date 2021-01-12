package bll;

import com.bean.FlightInfo;

import java.util.Set;

public class FlightServiceImpl implements IFlightService {
 public void insertFlight(FlightInfo flightInfo){
     System.out.println(flightInfo);
 }

    @Override
    public Set<FlightInfo> getAllFlight() {
        return null;
    }

    @Override
    public FlightInfo getFlightVyDepartureCity(String departureCity) {
        return null;
    }

    @Override
    public FlightInfo getFlightByArriveCity(String arriveCity) {
        return null;
    }

    @Override
    public FlightInfo getFlightVyDepartureDate(String departureDate) {
        return null;
    }

    @Override
    public void updateFlight(FlightInfo flightInfo) {

    }

    public Set<FlightInfo> getALLFlight(){
     return null;
 }
 public FlightInfo getFlightByDepartureCity(String departureCity){};

}
