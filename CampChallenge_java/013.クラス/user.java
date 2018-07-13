/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken;
import java.util.Random;

/**
 *
 * @author amoro_000
 */
public class user {
    
    public String hand="";//コンストラクタ、出した手を収納。
    
    public int open(){//出す手を決定するための乱数を生成。
	int hands=0;
	    Random rand=new Random();
		Integer i=rand.nextInt(3);//0~2の乱数を生成。
		    hands=i;
	return hands;//戻り値に作成した乱数を返す。
    }
    
    public void role(int a){//open();で出した乱数をもとに出す手を決定。
	switch(a){
                case 0:
                    this.hand="グー";
		    break;
                case 1:
                    this.hand="チョキ";
		    break;
		case 2:
		    this.hand="パー";
		    break;
	}
    }
    
    public String check(int a,int b){//勝敗判定。
	if(a==0){//グーの時。
	    switch (b) {
	    	case 0:
		    return "DRAW";
	    	case 1:
		    return "WIN";
	    	default:
		    return "LOSE";
	    }
	}
	if(a==1){//チョキの時。
	    switch (b) {
	    	case 0:
		    return "LOSE";
	    	case 1:
		    return "DRAW";
	    	default:
		    return "WIN";
	    }
	}
	if(a==2){//パーの時。
	    switch (b) {
	    	case 0:
		    return "WIN";
	    	case 1:
		    return "LOSE";
	    	default:
		    return "DRAW";
	    }
	}return null;
    }
    
	
}
