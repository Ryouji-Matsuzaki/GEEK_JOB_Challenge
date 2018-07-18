/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateBase;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author guest1Day
 */
public class table_delete {
     public static void main(String[] args) {

            String url ="jdbc:mysql://localhost:3306/geekjob_db?serverTimezone=JST";
                //serverTimezoneを指定すること
                String user="matsuzaki";
                    String pass="0503bdfb";

            Connection db_con=null;
                PreparedStatement db_ps =null;
                //変数定義
                    
            String sql="delete from profiles where profilesID=?";
                //SQL文の定義
            try{ 
                Class.forName("com.mysql.cj.jdbc.Driver");
                    //ＳＱＬドライバーの選択、「jc.」を入れないとエラー

                db_con=DriverManager.getConnection(url,user,pass);
                
                db_ps=db_con.prepareStatement(sql);
                
                db_ps.setInt(1, 4);
                
                                
                if(db_ps.executeUpdate()==0){
                    System.out.println("delete成功");
                }else{
                    System.out.println("delete失敗");
                    }
                    //実行結果
                
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
