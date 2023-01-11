public class BreakContinue01 {
    public static void main(String[] args) {

      // break文とは、switch文のbreak文と同じで、ループ処理の途中でループ処理を終了させたい場合に使用する制御文
        for (int count = 0; count < 5; count++) {
            if (count == 2) {
                // countが2の場合、for文を終了
                break;
            }
            System.out.println("Break01= " + count);
        }
    }
}