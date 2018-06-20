/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Timestamp;

import java.util.*;

/**
 *
 * @author Dell
 */
public class timestamp2 {
    public static void main(String[] args){
        Calendar t=Calendar.getInstance();
            t.set(2015,0,1,0,0);
                Date e=t.getTime();
                
        Calendar r=Calendar.getInstance();
            r.set(2015,11,31,23,59,59);
                Date w=r.getTime();
        
        System.out.println(w.getTime()-e.getTime());
       
        
    }
}
