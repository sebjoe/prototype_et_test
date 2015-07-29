/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proto_algo_recoroute.ressource;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author sebastien
 */
public class Route {
    public List<BusStop> listBusStopRoute = new LinkedList<>();
    //the position has to be in the listBusStop Route
    public int location;
    public int destination;
    
    public Route (int location, int destination){
        this.location = location;
        this.destination = destination;
        locationToBusStop(location);
        locationToBusStop(destination);
        
    }
    
    private void locationToBusStop (int location){
        for(BusStop b : BusStop.listBusStopTotal){
            if ( b.inTheRangeOfDelta(location)){
                listBusStopRoute.add(b);
                break;
            }
        }            
    }
    
    public void addStops(BusStop busStop){
        if(!listBusStopRoute.isEmpty()){
            BusStop b = listBusStopRoute.get(listBusStopRoute.size()-1);
            listBusStopRoute.set((listBusStopRoute.size()-1), busStop);
            listBusStopRoute.add(b);
        }
        else{
            System.out.println("GET MAMAN'W");
        }
        
    }
    
    public String toString(){
        String s = new String("");
        for(BusStop b : listBusStopRoute){
            //System.out.println(" | "+b.location+" | ");
            s = s.concat(" | Location "+b.location+" | ");
        }         
        return s;
    }
    
    
  
    
    
//    private int delta = 3;
//    public int sumE = 0;
//    public int sumR = 0;
//    public int E;
//    public void rFonction (int position, List<BusStop> listBusStopTotal){
//        for (BusStop b: listBusStopTotal){
//            if (b.location < (position + 3) && (position -3) < b.location ){
//                sumE = sumE + position*b.location;
//            }
//        }
//        E = sumE/position;
//        System.out.println("La valeur de E: "+E);
//         
//    }
//    
//    public void usefulnessRoute(){
//        for (BusStop b : listBusStopRoute){
//            
//            sumR = sumR + b.location;
//            
//        }
//        System.out.println("La valeur de rcs: "+sumR);
//    }
//    
//    // A reflechir et poser des questions
//    public void usefulnessBusStop(){
//        
//    }
}
