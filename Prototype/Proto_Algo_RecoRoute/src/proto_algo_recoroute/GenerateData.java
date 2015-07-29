/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proto_algo_recoroute;

import proto_algo_recoroute.ressource.User;
import proto_algo_recoroute.ressource.BusStop;
import proto_algo_recoroute.ressource.Route;
import java.util.LinkedList;
import java.util.List;
import proto_algo_recoroute.calculs.AccesMatrix;
import proto_algo_recoroute.calculs.EquationRcs;

/**
 *
 * @author sebastien
 */
public class GenerateData {
     public List<BusStop> listBusStopTotal = new LinkedList<>();
    
     
     public GenerateData(){
         
        BusStop b1 = new BusStop(101);
        BusStop b2 = new BusStop(111);
        BusStop b3 = new BusStop(121);
        BusStop b4 = new BusStop(181);

        BusStop b5 = new BusStop(241);
        BusStop b6 = new BusStop(251);
        BusStop b7 = new BusStop(303);
        BusStop b8 = new BusStop(301);
        
        BusStop.listBusStopTotal.add(b1);
        BusStop.listBusStopTotal.add(b2);
        BusStop.listBusStopTotal.add(b3);
        BusStop.listBusStopTotal.add(b4);
        BusStop.listBusStopTotal.add(b5);
        BusStop.listBusStopTotal.add(b6);
        BusStop.listBusStopTotal.add(b7);
        BusStop.listBusStopTotal.add(b8);
        

        User u1 = new User("u11");
        User u2 = new User("u12");
        User u3 = new User("u13");
        User u4 = new User("u14");
        User u5 = new User("u21");
        User u6 = new User("u22");
        User u7 = new User("u23");
        User u8 = new User("u24");

        AccesMatrix accesMatrix = new AccesMatrix();
        System.out.println("accesMatrix.listMatrixBusStop.get(0).vote;"+accesMatrix.listMatrixBusStop.get(0).vote);
        
        
        ///////////////PRINT///////////////////////////////////////////////
        
        System.out.println("\nThe Bus Stop are : ");
        System.out.println(b1.toString());
        
        
        //System.out.println("Size of the listUserTotal "+User.listUserTotal.size()+"\n");
        
        
        System.out.println("user1 : ");
        System.out.println(u1.profil.toString());
        
        System.out.println("user2 : ");
        System.out.println(u2.profil.toString());
        
        System.out.println("user3 : ");
        System.out.println(u3.profil.toString());
        
        System.out.println("user4 : ");
        System.out.println(u4.profil.toString());
        
        System.out.println("user5 : ");
        System.out.println(u5.profil.toString());
        
        System.out.println("user6 : ");
        System.out.println(u6.profil.toString());
        
        System.out.println("user7 : ");
        System.out.println(u7.profil.toString());
        
        System.out.println("user8 : ");
        System.out.println(u8.profil.toString());
        
        //System.out.println("Size of the listBusStopTotal "+BusStop.listBusStopTotal.size()+"\n");
        Route route1 = new Route(101, 303);
        route1.addStops(b1);
        route1.addStops(b5);
        route1.addStops(b7);
        
        Route route2 = new Route(101, 303);
        route2.addStops(b2);
        route2.addStops(b4);
        route2.addStops(b8);
        
        Route route3 = new Route(101, 303);
        route3.addStops(b1);
        route3.addStops(b4);
        route3.addStops(b7);
        route3.addStops(b8);
        
        System.out.println("\n\nThe routes : ");
        System.out.println("Route1 "+route1.toString());
        System.out.println("Route2 "+route2.toString());
        System.out.println("Route3 "+route3.toString());
        
        EquationRcs equationR1cs = new EquationRcs(u1, route1);
        EquationRcs equationR2cs = new EquationRcs(u1, route2);        
        EquationRcs equationR3cs = new EquationRcs(u1, route3);
        
        
        System.out.println("\n\n RCS : ");
        System.out.println(equationR1cs.toString());
        System.out.println(equationR2cs.toString());
        System.out.println(equationR3cs.toString());
                
        
     }
     
     
}
