/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proto_algo_recoroute.calculs;

import java.util.LinkedList;
import java.util.List;
import proto_algo_recoroute.ressource.BusStop;
import proto_algo_recoroute.ressource.CoupleVoteBusStop;
import proto_algo_recoroute.ressource.CoupleVoteLocation;
import proto_algo_recoroute.ressource.User;

/**
 *
 * @author sebastien
 */
public class AccesMatrix {
    public static List<CoupleVoteLocation> listMatrixBusStop = new LinkedList<>();
    double sumE = 0;
    double ecsj = 0;
   //public List<CoupleVoteBusStop> listCoupleVoteBusStops = new LinkedList<>();
    private int compteur = 0;
    
    // probablement pas besoin de ca car le constructeur ne fait rien
    public AccesMatrix(){
        int i = 0;
        for (BusStop b: BusStop.listBusStopTotal){
            for(User u: User.listUserTotal){
                for(CoupleVoteLocation c : u.listVoteLocations){
                    if(c.location <  (b.location+b.delta) && c.location > (b.location - b.delta) ){
                        sumE = c.vote;
                        compteur++;
                    }
                }
            }
            ecsj = sumE/compteur;
            b.levelAcces = ecsj;
            BusStop.listBusStopTotal.set(i, b);
            listMatrixBusStop.add(new CoupleVoteLocation(ecsj, b.location));
            ecsj= 0;
            sumE = 0;
            compteur =0;
        }
    }
    
    public static double findAcces(int location){
        //System.out.println("findAcces");
        for(CoupleVoteLocation cvl : listMatrixBusStop){
           // System.out.println("for");
            if (cvl.location == location){
               // System.out.println("findAcces cvl.vote"+cvl.vote);
                return cvl.vote;
            }
            
        }
        
        return -1;
    }
}
