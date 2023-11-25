
public class SevenNumber {

	public static void main(String[] args) {
		// iの値が100より小さい間、処理を繰り返す
		for (int i = 1; i< 100; i++) {
			// iの値が7の倍数または7が入っている数の時
			if(i % 7 ==0 || i % 10 == 7 || i / 10 == 7) {
				// clap!と表示する
				System.out.println("clap!");
			} else {
				System.out.println(i);
			}
		}
	}
}
