/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
import java.util.*;
/**
 *
 * @author Dell
 */
public class logfile {
    public static void main(String[] args){//1~10までの平方根を表示
        Date start=new Date(System.currentTimeMillis());
            System.out.println(start+" 処理を開始しました");    
        
            for(int i=1;i<11;i++){
                Double a=Math.sqrt(i);
                    System.out.println(a); 
            }
        
        Date end=new Date(System.currentTimeMillis());
            System.out.println(end+" 処理を終了しました"); 
    }
}
