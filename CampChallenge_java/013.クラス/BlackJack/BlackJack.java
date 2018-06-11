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

    public static void main(String[] args) {

        Dealer obj = new Dealer();//ディラーを作成

        User matuzaki = new User();//プレイヤーを作成

        System.out.println("【ゲーム開始！！】");

        ArrayList deala = obj.deal();//ArrayListを作成し二枚カードを引く
        System.out.println("ディーラーは" + deala + "を引きました");
        obj.setCard(deala);//引いたカードをディーラーの手札に追加

        ArrayList dealb = obj.deal();//ArrayListを作成し二枚カードを引く
        System.out.println("プレイヤーは" + dealb + "を引きました");
        matuzaki.setCard(dealb);//引いたカードをプレイヤーの手札に追加

        System.out.println("ディーラーのスコアは" + obj.open() + "です。");//引いたカードの合計を表示
        System.out.println("プレイヤーのスコアは" + matuzaki.open() + "です。");

        System.out.println("【プレイヤーのターン】");
        while (matuzaki.open() < 17) {//スコアが１７以上ならhitし続ける。
            if (matuzaki.checkSum()) {
                matuzaki.setCard(obj.hit());//hitカードを手札に加える。
                System.out.println("プレイヤーはhit");
                System.out.println("プレイヤーのカードは" + matuzaki.mycard+"になりました。");
                System.out.println("プレイヤーのスコアは" + matuzaki.open()+"です。");
            }
            if (matuzaki.open() >= 22) {//22以上になった時にゲームを終了
                System.out.println("プレイヤーはバストしました。ディーラーの勝利・・・");
                System.exit(0);
            }
        }

        System.out.println("プレイヤーはスタンド");
        
        System.out.println("【ディーラーのターン】");

        while (obj.open() < 17) {//プレイヤーの処理と同様に
            if (obj.checkSum()) {
                obj.setCard(obj.hit());
                System.out.println("ディーラーはhit");
                System.out.println("ディラーのカードは" + obj.mycard+"になりました。");
                System.out.println("ディーラーのスコアは" + obj.open()+"です。");
            }
            if (obj.open() >= 22) {
                System.out.println("ディーラーはバストしました。プレイヤーの勝利！！");
                System.exit(0);
            }
        }

        System.out.println("ディーラーはスタンド");
        
        System.out.println("【勝敗判定】");
        
        System.out.println(matuzaki.open()+"対"+obj.open()+"で・・・");

        if (matuzaki.open() < obj.open()) {
            System.out.println("ディラーの勝利・・・");
        } else if (matuzaki.open() > obj.open()) {
            System.out.println("プレイヤーの勝利！！！");
        } else if (matuzaki.open() == obj.open()) {
            System.out.println("引き分け");
        }
    }
}
