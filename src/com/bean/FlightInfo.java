package com.bean;

public class FlightInfo {
    private String id;
    private String flightId;//飞机编号
    private int currentSeatsNum;//当前座位
    private String planeType;//机型
    private String departureCity;//出发城市
    private String arriveCity;//到达城市
    private String deparTureDate;//出发时间

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public int getCurrentSeatsNum() {
        return currentSeatsNum;
    }

    public void setCurrentSeatsNum(int currentSeatsNum) {
        this.currentSeatsNum = currentSeatsNum;
    }
    public FlightInfo(String id,String flightId,int currentSeatsNum,String planeType,
    String departureCity,String arriveCity,String departureDate) {
        this.id=id;
        this.flightId=flightId;
        this.currentSeatsNum=currentSeatsNum;
        this.planeType=planeType;
        this.departureCity=departureCity;
        this.arriveCity=arriveCity;
        this.deparTureDate=deparTureDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getDeparTureDate() {
        return deparTureDate;
    }

    public void setDeparTureDate(String deparTureDate) {
        this.deparTureDate = deparTureDate;
    }
    public String toString (){
        return "FlightInfo{ " +
                "id='" + id+'\''+
                ",flightId='" +flightId+'\''+
                ",currentSeatsNum="+currentSeatsNum+
                ",planeType='"+planeType+'\''+
                ",departureCity='"+departureCity+'\''+
                ",arriveCity=,"+arriveCity+'\''+
                ",departureDate="+deparTureDate +'}';
        }
    }
}
