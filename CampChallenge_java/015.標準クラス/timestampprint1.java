/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Timestamp;
import java.util.*;
import java.text.SimpleDateFormat;
/**
 *
 * @author Dell
 */
public class timestampprint1 {
    public static void main(String[] args){
        Calendar t =Calendar.getInstance();
        
        t.set(2016,10,4,10,0,0);
        
        Date dl=t.getTime();
        
        System.out.println(dl.getTime());
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       
        System.out.println(sdf.format(dl));
        
        
    }
    
}
