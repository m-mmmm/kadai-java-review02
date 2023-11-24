
public class Review01 {

	public static void main(String[] args) {
		//1500円の商品の税込価格は1650円（消費税は150円）です。

		int price = 1500;
		double tax = 0.1;
		int result;
		result = tax(price,tax);
		//税込み価格
		int priceInTax = price + result;
		System.out.println(price + "円の商品の税込み価格は" + priceInTax + "円（消費税は" + result + "円）です。");
	}

	public static int tax(int price, double tax){
		double result = price * tax;
		return (int) result;
	}
}