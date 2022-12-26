// 確認問題
// ・自分の名前を「String」型の変数に代入して出力
// ・好きな言葉を同じ変数に再代入して出力
// ・ラッキーナンバーとして「int」型で宣言した定数を出力

public class Chapter04 {
    public static void main(String[] args) {
        String str1 = "髙木隼翔";
        System.out.println(str1);

        str1 = "だらけきった正義";
        System.out.println(str1);

        final int LUCKY_NUMBER = 7;
        System.out.println(LUCKY_NUMBER);
    }
}