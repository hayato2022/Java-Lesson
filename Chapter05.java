// 確認問題
// ・プリミティブ型の「long」「double」「boolean」の変数に値を代入して出力
// ・ラッパークラスの「Float」「Integer」「Character」の変数に値を代入して出力
// ・要素数が5の「int」配列に値を代入して、インデックス番号が3の値を出力

public class Chapter05 {
      public static void main(String[] args) {
          long long1 = 9223372036854775807L;
          System.out.println(long1);
          double double1 = 123456.89d;
          System.out.println(double1);
          boolean boolean1 = true;
          System.out.println(boolean1);


          Float float1 = 0.123f;
          System.out.println(float1);
          Integer integer1 = 1;
          System.out.println(integer1);
          Character character1 = 'あ';
          System.out.println(character1);


          int[] array1 = new int[5];
          array1[0] = 20;
          array1[1] = 80;
          array1[2] = 39;
          array1[3] = 40;
          array1[4] = 50;

          int int1 = array1[3];
          System.out.println(int1);

          // 宣言と同時に初期化ver
          int[] array2 = new int[] {1, 2, 3, 4, 5};
          int int2 = array2[3];
          System.out.println(int2);

          int[] array3 = {3, 4, 5, 6, 7};
          int int3 = array3[3];
          System.out.println(int3);
      }
  }