public class Main {
    public static void main(String[] args) {
        int sayi1 = 266;
        int sayi2 = 25;
        int sayi3 = 26;
        int enBuyuk ;

        if (sayi1 >= sayi2 && sayi1 >= sayi3){
            enBuyuk = sayi1;
        } else if (sayi2 >= sayi1 && sayi2 >= sayi3) {
            enBuyuk = sayi2;
        }else {
            enBuyuk = sayi3;
        }

        System.out.println("En büyük sayı: " + enBuyuk);
    }
}