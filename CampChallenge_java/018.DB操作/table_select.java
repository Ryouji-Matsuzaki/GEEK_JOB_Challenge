/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateBase;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author guest1Day
 */
public class table_select {
    
   public static void main(String[] args) {
        
        String url ="jdbc:mysql://localhost:3306/geekjob_db?serverTimezone=JST";
            //serverTimezoneを指定すること
            String user="matsuzaki";
                String pass="0503bdfb";
                
        Connection db_con=null;
                
        String sql="select* from profiles;";
        
        try{ 
            Class.forName("com.mysql.cj.jdbc.Driver");
                //ＳＱＬドライバーの選択、「jc.」を入れないとエラー
                
            db_con=DriverManager.getConnection(url,user,pass);
            
            Statement stmt =db_con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            
            while(rs.next()){
                //next()はリストに情報がある限りtureを返す。
                System.out.println(rs.getInt("profilesID"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("tel"));
                System.out.println(rs.getInt("age"));
                System.out.println(rs.getDate("birthday"));
            }
   
            stmt.close();
            rs.close();
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
