public class ClassMethod01 {
    public static void main(String[] args) {
        Human01 yamada = new Human01(); //Human01クラスのインスタンスを生成
        System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

        Human01 sato = new Human01("佐藤", 25); //Human01クラスのインスタンスを生成
        System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
    }
}

// 解説
// 実行用ファイル
// ・引数なしのコンストラクタを用いて、Human01クラスのインスタンスを生成する
// ・上記のインスタンスのnameとageを表示すると、コンストラクタで代入した初期値が表示される
// ・引数2つのコンストラクタを用いて、Human01クラスのインスタンスを生成する
// ・上記のインスタンスのnameとageを表示すると、コンストラクタの引数に渡した値が表示される