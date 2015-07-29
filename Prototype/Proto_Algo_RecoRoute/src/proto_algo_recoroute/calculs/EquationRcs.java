/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proto_algo_recoroute.calculs;

import java.util.LinkedList;
import java.util.List;
import proto_algo_recoroute.ressource.BusStop;
import proto_algo_recoroute.ressource.CoupleVoteLocation;
import proto_algo_recoroute.ressource.Route;
import proto_algo_recoroute.ressource.User;

/**
 *
 * @author sebastien
 */
public class EquationRcs {
    
    double sumRcs =0;
    public List<CoupleVoteLocation> listrcsj = new LinkedList<>();
    public EquationRcs(User c, Route route){       
        double rcsj =0 ;
                
        for(BusStop b : route.listBusStopRoute){
            
            //pos = b.findIndex(b.location);
            
            EquationRcsj ercsj = new EquationRcsj();
            rcsj = ercsj.r_c_sj(c,b.location);
            System.out.println("\n rcsj"+rcsj );
            sumRcs = sumRcs + rcsj;
            listrcsj.add(new CoupleVoteLocation(rcsj, b.location));
        }
       
    }  
   
    
    public String toString(){
        String s = new String("");
        for(CoupleVoteLocation cvl : listrcsj){
            //System.out.println(" | "+b.location+" | ");
            s = s.concat(" | "+cvl.toString()+" | ");
        }
         System.out.println("\n Usefulness of route  is : "+sumRcs);
        return s;
    }
}
