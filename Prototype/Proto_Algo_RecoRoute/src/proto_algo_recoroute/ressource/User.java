/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proto_algo_recoroute.ressource;
import java.util.LinkedList;
import java.util.List;
import proto_algo_recoroute.calculs.Profil;
/**
 *
 * @author sebastien
 */
public class User {
    
    public String userName;
   
    public Profil profil;
    public static List<User> listUserTotal = new LinkedList<>();
    
    //Pour le moment on va dire que la matix est faite aleatoirement sans le vote
    //des users :)
    //public List<CoupleVoteBusStop> listVoteBusStops = new LinkedList<>();
    
    //La list de vote pour chaque endroit ou le user pense que cest accessible
    // Comment initialiser la list ????
    public List<CoupleVoteLocation> listVoteLocations = new LinkedList<>();
    
    
    public User(String un){
        userName = un;
        profil = new Profil();
        listUserTotal.add(this);      
        voteUser();
    }
    
    private void voteUser(){
        int lower = 1;
        int higher = 4;
        int random = (int)(Math.random() * (higher-lower)) + lower;
        for (BusStop b: BusStop.listBusStopTotal){
            //listVoteBusStop.add(new CoupleVoteBusStop(random, b));
            //random = (int)(Math.random() * (higher-lower)) + lower;
            listVoteLocations.add(new CoupleVoteLocation(random, b.location));
            random = (int)(Math.random() * (higher-lower)) + lower;
        }
    }
    
    
}
