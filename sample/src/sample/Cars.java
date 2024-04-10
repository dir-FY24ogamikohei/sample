package sample;

public class Cars {
//メンバ変数(属性)
    int num;
    int speed;
//メソッド(操作)
     void setNum(int n) {
     num = n;
     }
     void run(int s) {
     speed = s;
     }
     void stop() {
     speed = 0;
     }
     void display() {
     System.out.println("ナンバー"＋num+"の速度は"＋speed+ "です");
     }
}
