public class Human01 {
    public String name; //メンバー変数
    public int age;  //メンバー変数

    //引数なしのコンストラクタ
    public Human01() {
        name = "山田";
        age = 20;
    }

    public Human01(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// 解説
// Human01クラス
// ・アクセス修飾子[public]を用いてどこからでもアクセスできるクラスHuman01を定義する
// ・アクセス修飾子[public]を用いてどこからでもアクセスできるメンバー変数[name]と[age]を定義する
// ・引数なしのコントラスタを定義する。これを用いて初期化した場合、nameは「山田」、
//   ageは「20」という値で初期化される(それぞれ変数にセットされる)
// ・引数2つ(String型とint型)のコンストラクタを定義する。これを用いて初期化した場合、
//   nameもageも引数として渡した値で初期化される。初期化対象は生成したインスタンスのメンバー変数なので、
//   thisキーワードを用いて指定する

