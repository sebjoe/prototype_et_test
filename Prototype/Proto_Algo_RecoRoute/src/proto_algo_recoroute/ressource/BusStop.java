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
public class BusStop {
    //public String routeName;
    public int location;
    public static List<BusStop> listBusStopTotal = new LinkedList<>();
    public double levelAcces;
    public static  final int delta = 3;
    //public List<CoupleVoteUser> listVoteUser = new LinkedList<>();
    
    public BusStop (int location){
        //this.routeName = routeName;
        this.location = location;
        //listBusStopTotal.add(this);
        
//        int lower = 1;
//        int higher = 3;
//        
//        levelAcces = (int)(Math.random() * (higher-lower)) + lower;
        //listVoteUser.add(new CoupleVoteUser(user, location));
    }
    
    public boolean inTheRangeOfDelta(int location){
        if (location < (this.location+delta) && location > (this.location -delta) ){
            return true;
        }
        else{return false;}
    }
    
    public int findIndex(int location){
        int i;
        for(i = 0; i<listBusStopTotal.size() && location != listBusStopTotal.get(i).location; i++){
         System.out.println("IIIIIIIIIIIIIII > "+i);
        }
        //System.out.println("IIIIIIIIIIIIIII > "+i);
        if(location == listBusStopTotal.get(i).location){
            return i;
        }
        else{return -1;}
    }
    
    public void addBusstop(){
        
    }
    
    public String toStringAll(){
        String s = new String("");
        for(BusStop b : listBusStopTotal){            
            s = s.concat(" | "+b.location+" | ");
        }
        return s;
    }

}
