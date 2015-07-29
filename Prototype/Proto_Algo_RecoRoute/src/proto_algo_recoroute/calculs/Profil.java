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

/**
 *
 * @author sebastien
 */
public class Profil {
    //public List<BusStop> listBusStopTotal = new LinkedList<>();
    //public List<CoupleVoteBusStop> listVoteBusStop = new LinkedList<>();
    public List<CoupleVoteLocation> vectorProfil = new LinkedList<>();
    
    public Profil (){
        int lower = 0;
        int higher = 2;
        int random = (int)(Math.random() * (higher-lower)) + lower;
        
        for (BusStop b: BusStop.listBusStopTotal){
            //listVoteBusStop.add(new CoupleVoteBusStop(random, b));
            //random = (int)(Math.random() * (higher-lower)) + lower;
            vectorProfil.add(new CoupleVoteLocation(random, b.location));
            random = (int)(Math.random() * (higher-lower)) + lower;
        }
    }
    
    public int getVote (int location){
        for (CoupleVoteLocation c : vectorProfil){
            if(c.location == location){
                return (int) c.vote;
                //break;
              
            }
        }
        return -1;
    }
    
    public String toString(){
        String s = new String("");
        for(CoupleVoteLocation cvl : vectorProfil){
            //System.out.println(" | "+b.location+" | ");
            s = s.concat(" | "+cvl.vote+" | ");
        }
        return s;
    }
}
