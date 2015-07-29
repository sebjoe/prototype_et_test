/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proto_algo_recoroute.ressource;

/**
 *
 * @author sebastien
 */
public class CoupleVoteBusStop {
    public int vote;
    public BusStop busStop;
 
    
    public CoupleVoteBusStop(int vote, BusStop busStop){
        this.vote = vote;
        this.busStop = busStop;
    
    }
    
}
