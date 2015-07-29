/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proto_algo_recoroute.calculs;

import java.util.LinkedList;
import java.util.List;
import proto_algo_recoroute.ressource.BusStop;
import proto_algo_recoroute.ressource.User;
import sun.java2d.pipe.hw.AccelDeviceEventListener;
import proto_algo_recoroute.ressource.BusStop;

/**
 *
 * @author sebastien
 */
public class EquationRcsj {
    
    public double sumRcsj = 0 ;
  
    public List<User> listUsersC = new LinkedList<>();
    //AccesMatrix accesMatrix;
    public EquationRcsj(){
        //r_c_sj(c,busProfilPosition);
    }
    
    
    //Soit je cree un ensemble pour former C (la liste des similaire
    //public List<User> ensembleC(User c, int busProfilPosition){\
    
    public double r_c_sj(User c, int location){
        double simVaraible;
        double e_cprime_sj;
        
        for(User cprime : User.listUserTotal){
            
            if( profilEquals(location, c, cprime)){
                //Soit je cree un ensemble pour former C (la liste des similaire
                //listUsersC.add(c);
                
                //ou je fais directement le calcul
                simVaraible = sim(c,cprime);
                //e_cprime_sj = BusStop.listBusStopTotal.get(busProfilPosition).location;
                e_cprime_sj = AccesMatrix.findAcces(location);
                sumRcsj = sumRcsj + simVaraible * e_cprime_sj ; 
                
                System.out.println(" e_cprime_sj "+e_cprime_sj);
               
            }            
        }
        return sumRcsj;
        //return listUsersC;      
    }
    
    
    
    public double sim (User c, User cprime ){
        double numerator = 0;
        for (int i = 0; i < c.profil.vectorProfil.size(); i++){
            numerator = numerator + c.profil.vectorProfil.get(i).vote * cprime.profil.vectorProfil.get(i).vote;            
        }
        double n1 = norme(c);
        double n2 = norme(cprime);
        
        return numerator/(n1*n2);
    }
    
    public double norme(User c){
        double sum = 0;
        for(int i=0; i < c.profil.vectorProfil.size(); i++){
            sum = (double) (sum + Math.pow(c.profil.vectorProfil.get(i).vote,2));
        }
        return Math.sqrt(sum);
    }
  
    public double findE_cPrime_sj(int location){
        int i;
        for(i =0; i < AccesMatrix.listMatrixBusStop.size() &&  AccesMatrix.listMatrixBusStop.get(i).location != location; i++){
                           
        }
        if( AccesMatrix.listMatrixBusStop.get(i).location == location){
                return AccesMatrix.listMatrixBusStop.get(i).vote;
                
        }
        else {return -1;}
    }
    
    public boolean profilEquals(int location, User c, User cprime){
        if(c.profil.getVote(location) == cprime.profil.getVote(location)){
            return true;
        }
        else{return false;}
    }
        
}
