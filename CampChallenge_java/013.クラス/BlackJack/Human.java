/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
abstract class Human {//プレイヤーの共通クラスを作成
    public ArrayList<Integer> mycard =new ArrayList<>();
    
    abstract public int open();//手札の合計を計算
      
    abstract public void setCard(ArrayList<Integer> list);//引いたカードを手札に加える
   
    abstract public boolean checkSum();//手札の合計が17以上かを判定
    
}
    
    
        
    
        
    
    

