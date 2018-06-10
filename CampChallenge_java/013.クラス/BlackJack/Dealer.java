/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/**
 *
 * @author Dell
 */
public class Dealer extends Human {//プレイヤー「ディーラー」クラスを作成、Humanクラスを継承
    
    public ArrayList<Integer> card =new ArrayList<>();//山札を作成
    
        public Dealer(){//山札に52枚のカードをセット
            
                ArrayList<Integer> list1 =new ArrayList<>();
                    for(int i=1;i<13;i++){
                    list1.add(i);
                }
                ArrayList<Integer> list2 =new ArrayList<>();
                    for(int d=1;d<13;d++){
                    list2.add(d);
                }
                ArrayList<Integer> list3 =new ArrayList<>();
                    for(int j=1;j<13;j++){
                    list3.add(j);
                }
                
                ArrayList<Integer> list4 =new ArrayList<>();
                    for(int n=1;n<13;n++){
                    list4.add(n);
                }
                        card.addAll(list1);
                        card.addAll(list2);
                        card.addAll(list3);
                        card.addAll(list4);
                        
                            Collections.shuffle(card);
        }
        public ArrayList deal(){//初期手札2枚を山札から引く
            
            ArrayList<Integer> card2= new ArrayList<>();
            
                Random rand=new Random();
                
                    while(card2.size()<2){
                        Integer i =rand.nextInt(this.card.size());
                        card2.add(this.card.get(i));
                        this.card.remove(i);
                    }
                    return card2;
        }
        public ArrayList hit(){//山札から1枚引く
            
            ArrayList<Integer> hitcard=new ArrayList<>();
                
                Random rand=new Random();
                    Integer i=rand.nextInt(this.card.size());
                    hitcard.add(this.card.get(i));
                
                    return hitcard;
                }
}
                              
        

