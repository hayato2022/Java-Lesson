public class For01 {
    public static void main(String[] args) {
        // for文：
        // 初期化式：numberを1で初期化
        // 条件式：numberが5以下の場合、ブロックの処理を行う
        // 変化式：ブロックの処理後に、numberをインクリメント
        for (int number = 1; number <= 5; number++) {
            System.out.println("For01= " + number);
        }

        // 拡張for文：
        // 配列の要素を順番にnumberに代入し、要素分繰り返す
        int[] array = {1,2,3,4,5};
        for (int number : array){
            // ブロック：numberを出力
            System.out.println("For02= " + number);
        }
    }
}