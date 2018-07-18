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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author guest1Day
 */
public class table_update {
     public static void main(String[] args) {

            String url ="jdbc:mysql://localhost:3306/geekjob_db?serverTimezone=JST";
                //serverTimezoneを指定すること
                String user="matsuzaki";
                    String pass="0503bdfb";

            Connection db_con=null;
                PreparedStatement db_ps =null;
                    //変数定義
                    
            String sql="update profiles set name= ? where profilesID=2";
                String sql_s="select* from profiles";
                    //SQL文の定義
            try{ 
                Class.forName("com.mysql.cj.jdbc.Driver");
                    //ＳＱＬドライバーの選択、「jc.」を入れないとエラー

                db_con=DriverManager.getConnection(url,user,pass);
                    //dbにアクセス
                db_ps=db_con.prepareStatement(sql);
                    db_ps.setString(1, "田中 勝");
                        //updateのSQL文の実行
                if(db_ps.executeUpdate()==1){
                    //実行結果、変数db_psに１があるときtrue
                    System.out.println("update成功");
                }else{
                    System.out.println("update失敗");
                    }
                    
                Statement stmt =db_con.createStatement();
                    ResultSet rs=stmt.executeQuery(sql_s);
                        //rs変数にテーブルを格納、select文の実行
                while(rs.next()){
                    //next()はリストに情報がある限りtureを返す。
                    System.out.println(rs.getInt("profilesID"));
                    System.out.println(rs.getString("name"));
                    System.out.println(rs.getString("tel"));
                    System.out.println(rs.getInt("age"));
                    System.out.println(rs.getDate("birthday"));
                }
              
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
