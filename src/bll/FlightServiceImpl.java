package bll;

import com.bean.Customer;
import com.bean.FlightInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

public class FlightServiceImpl<conn> implements IFlightService {


    private Object parameterIndex;
    private PreparedStatement pstmt;
    private Customer flight;

    public FlightServiceImpl() throws SQLException {
    }

    @Override
    public void insertFlight(FlightInfo flightInfo) throws SQLException {
        String url="jbdc:oracle:thin:@localhost:1521:orcl";
        String  username="opts";
        String passwrod="opts1234";
        String password = null;
        Connection conn= DriverManager.getConnection(url,username,password);
        String sql="INSERT INTO flight VALUES(?,?,?,?,?,?,?);";
        PreparedStatement pastmt=conn.prepareStatement(sql);
        pstmt.setString(1,flight.getId());
        pstmt.setString(2,flight.getFlightId());
        pstmt.setString(3,flight.getPlaneType());
        pstmt.setInt(4, (Integer) flight.getCurrentSeatsNum());
        pstmt.setString(5,flight.getDepartureAirPort());
        pstmt.setString(6,  flight.getDestinationAirPort());
        pstmt.setString(7,  flight.getDepartureTime());
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
 public int getFlightByDepartureCity(String departureCity){
        return 0;
 };

}
