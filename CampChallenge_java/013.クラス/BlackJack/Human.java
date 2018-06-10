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
    
    public int open(){//手札の合計を計算
        Integer total=0;
        for(int i=0;i<mycard.size();i++){
            Integer forInte=mycard.get(i);
            total=total+forInte;
      }
      return total;
    }
    
    public void setCard(ArrayList list){//引いたカードを手札に加える
        
        this.mycard=list;
    }
   
    public boolean checkSum(){//手札の合計が17以上かを判定
    int sum = open(); 
        
        return sum<=17;
    }
}
    
        
    
        
    
    

