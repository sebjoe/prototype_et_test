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
public class CoupleVoteLocation {
    public double vote;
    public int location;
    
    public CoupleVoteLocation(double vote, int location){
        this.vote = vote;
        this.location = location;
    }
    
    public String toString(){
        String s = new String("");        
        s = s.concat("Location : "+location+" Vote : "+vote);        
        return s;
    }
}
