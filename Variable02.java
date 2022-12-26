// 定数の宣言 基本構文
// final 定数の型 定数名 = 初期値;
public class Variable02 {
    public static void main(String[] args){
      // 定数の宣言
      final int MIN_NUMBER = 10;
      System.out.println(MIN_NUMBER);

      // 再代入しようとするとエラー
      //MIN_NUMBER = 20;
    }
}