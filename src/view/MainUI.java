package view;

import bll.FlightServiceImpl;
import bll.IFlightService;
import com.bean.FlightInfo;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.UUID;

public class MainUI {
    public static void main(String[] args) throws SQLException {
        Scanner scanner=new Scanner(System.in);
        //String test=scanner.next();
      //  System.out.println(test);
        String id = null;
        while(true){
            System.out.println("请输入相应的数字选择:");
            System.out.println("1.录入航班信息");
            System.out.println("2.显示所有航班信息");
            System.out.println("3.查询航班信息");
            System.out.println("4.退出");
            int result=scanner.nextInt();
            if(result==1){
             System.out.println("请输入航班信息");

           /*  String id= UUID.randomUUID().toString();
               System.out.println(id.replace("-",""));*/

                System.out.println("请输入航班编号:");
                String flightId=scanner.next();
                System.out.println("机型:");
                String planeType=scanner.next();
                System.out.println("座位数:");
                int currentSeatsNum=scanner.nextInt();
                System.out.println("起飞机场:");
                String departureCity=scanner.next();
                System.out.println("目的机场:");
                String arriveCity=scanner.next();
                System.out.println("起飞时间:");
                String departureDate=scanner.next();
                FlightInfo flightInfo=new FlightInfo(id,flightId,currentSeatsNum,planeType,departureCity,arriveCity,departureDate);
                IFlightService iFlightService=new FlightServiceImpl();
                iFlightService.insertFlight(flightInfo);
            }
        }
    }
}
