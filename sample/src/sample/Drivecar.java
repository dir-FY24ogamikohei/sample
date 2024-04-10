package sample;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

public class Drivecar {

    public static void main(String[] args) {
        //Carクラスのオブジェクト生成
        Cars c1=new Cars();
        //ｃ１のナンバーを２５２５に設定
        c1.setNum(2525);
        //ｃ１の速度を３０に設定
        c1.run(30);
        //ｃ１のナンバー、速度を表示
        c1.display;
        //ｃ１の速度を０に設定
        c1.stop();
        //ｃ１のナンバー、速度を表示
        c1.display();
        
    }

}
