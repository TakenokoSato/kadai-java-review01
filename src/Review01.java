public class Review01 {

    public static void main(String[] args) {
        // int型の引数を持つtaxメゾットを呼び出す。
        int price = 1500;
        int taxOfPrice = tax(price);
        int TaxIncludedPrice = price+taxOfPrice;

       System.out.println(price+"円の商品の税込価格は"+TaxIncludedPrice+"円（消費税は"+taxOfPrice+"円）です。");
    }

    public static int tax(int num1) {
        int taxOfPrice =num1/10;
        return taxOfPrice;
    }

}
