/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
import java.io.*;

/**
 *
 * @author Dell
 */
public class filewriter {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        try{
            File mypro= new File("C:\\Users\\Dell\\Desktop\\mypro.txt");
            
            FileWriter fw=new FileWriter(mypro);
            
            fw.write("私の名前は松崎亮士です");
            
            fw.close();
        }catch(IOException e){   
        }
    
    }
}
