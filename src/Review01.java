public class Review01 {

    public static void main(String[] args) {
        // int型の引数を持つtaxメゾットを呼び出す。
        int price = 1500;
        int taxRate = 10;
        int taxOfPrice = tax(price,taxRate);
        int TaxIncludedPrice = price+taxOfPrice;

       System.out.println(price+"円の商品の税込価格は"+TaxIncludedPrice+"円（消費税は"+taxOfPrice+"円）です。");
    }

    public static int tax(int price,int taxRate) {
        int taxOfPrice =price/taxRate;
        return taxOfPrice;
    }

}
