public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 3;
        boolean sayiBul = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                sayiBul = true;
                break;
            }
        }

        if (sayiBul) {
            System.out.println(aranacak + " dizinin içerisindedir");
        } else {
            System.out.println(aranacak + " dizinin içerisinde değildir");
        }
    }
}