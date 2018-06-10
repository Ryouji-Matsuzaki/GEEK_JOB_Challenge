/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;
import java.util.*;
/**
 *
 * @author Dell
 */
public class BlackJack {//ブラックジャック実行クラス
    public static void main(String[] args){
        Dealer obj=new Dealer();//ディラーを作成
        User matuzaki=new User();//プレイヤーを作成
        
        ArrayList deala = obj.deal();//ArrayListを作成し二枚カードを引く
            System.out.println(deala);
                obj.setCard(deala);//引いたカードをディーラーの手札に追加
                
        ArrayList dealb = obj.deal();//ArrayListを作成し二枚カードを引く
            System.out.println(dealb);
                matuzaki.setCard(dealb);//引いたカードをプレイヤーの手札に追加
        
        System.out.println(obj.open());//引いたカードの合計を表示
        System.out.println(matuzaki.open());
        
          boolean check=obj.checkSum();
            while(check==true){
                ArrayList hit=obj.hit();//arraylist作成
                System.out.println(hit);//hitカードを表示
                obj.setCard(hit);//hitカードを手札に
                check=obj.checkSum();
                //System.out.println(obj.open());
            }
                //System.out.println("ディーラーのスコア"+obj.open());
    }   
            }
        
        
        
        
        
        
        
        
       
    
    
