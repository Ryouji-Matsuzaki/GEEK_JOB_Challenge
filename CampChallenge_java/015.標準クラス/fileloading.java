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
public class fileloading {
    public static void main(String[] args){
        try{
            File mypro= new File("C:\\Users\\Dell\\Desktop\\mypro.txt");
            
            FileReader fr=new FileReader(mypro);
            
            BufferedReader br=new BufferedReader(fr);
 
            System.out.print(br.readLine());
            
            fr.close();
        }catch(IOException e){   
        }
    
    }
    }

