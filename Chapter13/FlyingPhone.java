
public class FlyingPhone implements Phone, Flying {

    private int minutes;
    // コンストラクタ。引数でメンバ変数を初期化。
    public FlyingPhone(int minutes) {
        this.minutes = minutes;
    }

    // Flyingインターフェースのメソッドをオーバーライド
    public void fly() {
        System.out.println(minutes + " 分間、飛びます。 ");
    }

    // Phoneインターフェースのメソッドをオーバーライド
    public void call(String number) {
        System.out.println(number + " に電話します。通話できるのは飛んでいる間だけです。");
    }

    // オーバーライドしないとコンパイルエラー
    public void powerOff(){
        // Flyingのdefaultメソッドを呼び出す
        Flying.super.powerOff();
    }
}