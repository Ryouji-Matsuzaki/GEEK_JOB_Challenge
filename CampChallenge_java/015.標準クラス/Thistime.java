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
public class Thistime {
    public static void main(String[] args){
        Date a= new Date();
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
        
        System.out.println(sdf.format(a));
    }
}
