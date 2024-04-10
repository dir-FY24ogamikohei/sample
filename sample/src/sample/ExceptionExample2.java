package sample;

public class ExceptionExample2 {

    public static void main(String[] args) {
        System.out.println("処理開始");
        
        try {
            System.out.println("割り算開始");
            
            
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        } finally {
            // 例外の有無に関わらず、実行されるコードを書きます（オプション）
            System.out.println("割り算終了");
        }
          
        }

    }


