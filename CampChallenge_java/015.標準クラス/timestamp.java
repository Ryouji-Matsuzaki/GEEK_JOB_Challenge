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
public class timestamp {
    public static void main(String[] args){
        
        Calendar t=Calendar.getInstance();
        t.set(2016,0,1,0,0,0);
        Date r=t.getTime();
        
        System.out.println(r.getTime());
    }
}
