package ujiandua;

public class segitigaAngka {
    public static void main(String[] args) {

        Segitiga(1, 10, 1);
    }

    static void Segitiga(int awal, int akhir, int k) {
        for (int i = akhir; i >= awal; i--) {
            for (int j = k; j < i; j++) {
                if (j % 2 == 0) {
                    System.out.print("_");
                } else {
                    System.out.print(j + "");
                }
            }
            k = k + 1;
            System.out.println();
        }
    }
}
