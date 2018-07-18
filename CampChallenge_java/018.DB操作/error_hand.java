/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateBase;

import static java.lang.System.out;
import java.sql.*;
/**
 *
 * @author guest1Day
 */
public class error_hand {
    
    public static void main(String[] args) {
        
        String url ="jdbc:mysql://localhost:3306/geekjob_db?serverTimezone=JST";
            //serverTimezoneを指定すること
            String user="matsuzaki";
                String pass="0503bdfb";
                
                Connection db_con=null;
        try{ 
            Class.forName("com.mysql.cj.jdbc.Driver");
                //ＳＱＬドライバーの選択、「jc.」を入れないとエラー
                
            db_con=DriverManager.getConnection(url,user,pass);
   
            System.out.println("接続成功");
            db_con.close();
                //必ずクローズ
                
        }catch(SQLException | ClassNotFoundException e_sql){
            out.println("接続中にエラーが発生しました。"+e_sql.toString());
                //マルチキャッチ
        }finally{
            if(db_con !=null){
                try{
                    db_con.close();
                }catch(Exception e_con){
                System.out.println(e_con.getMessage());
                }
                
            }   
        }
    }
}
            
       