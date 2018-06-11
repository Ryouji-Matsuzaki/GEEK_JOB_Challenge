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
public class User extends Human {//プレイヤー「ユーザー」クラスを作成、Humanクラスを継承
    @Override
        public int open(){//手札の合計を計算

            int total=0;

            for(int i=0;i<mycard.size();i++){
                if(mycard.get(i)<=10){
                    total+=mycard.get(i);
                }
                else{
                    total+=10;
                }
            }
            return total;
        }

    @Override
        public void setCard(ArrayList<Integer> list){

            for(int i=0;i<list.size();i++){
                this.mycard.add(list.get(i));
            }
        }
    @Override
        public boolean checkSum(){//hitするかどうか判定、１７以下でtrueを返す

            int sum=0;

            for(int i=0;i<mycard.size();i++){
                if(mycard.get(i)<=10){
                    sum+=mycard.get(i);
                }
                else{
                    sum+=10;
                }
            }
        return sum<=17;
        }    
    }
