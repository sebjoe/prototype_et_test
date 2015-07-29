/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proto_algo_recoroute.ressource;

import proto_algo_recoroute.ressource.User;

/**
 *
 * @author sebastien
 */
public class CoupleVoteUser {
    public User user;
    public int vote;
    
    public CoupleVoteUser(User u, int v){
        user = u;
        vote = v;
    }
    
}
