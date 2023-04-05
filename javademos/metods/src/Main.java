public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean sayiBul = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                sayiBul = true;
                break;
            }
        }

        String mesaj="";
        if (sayiBul) {
            mesajVer(aranacak + " dizinin içerisindedir");
        } else {
            mesajVer(aranacak + " dizinin içerisinde değildir");
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}