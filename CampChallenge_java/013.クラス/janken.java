/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken;

/**
 *
 * @author amoro_000
 */
public class janken {
    public static void main(String arg[]){
	
	user player= new user();//playerを作成
	    user enemy= new user();//敵を作成
	    
	System.out.println("【じゃんけん開始】");
	
	int ahands=player.open();
	    player.role(ahands);//playerの出す手を決定。
	    
	int bhands=enemy.open();
	    enemy.role(bhands);//敵の出す手を決定。
	
	System.out.println("PLAYERは"+player.hand+"を出しました！！");
	
	System.out.println("相手は"+enemy.hand+"を出しました！！");
	
	System.out.println("PLAYER "+player.check(ahands,bhands));//勝敗判定。
    }
    
}
