
public class Review02 {

	public static void main(String[] args) {
		// iの値が１から100までの間、処理を繰り返す
		for (int i = 1; i <= 100; i++) {
			// iの値が3で割り切れるなら“Fizz”と表示する
		    if(i % 3 == 0 && i % 5 == 0) {
			System.out.println("FIzzBuzz");
		    }else if (i % 3 == 0) {
				System.out.println("Fizz");
			}else if(i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

	}

}
