public class Main {
    public static void main(String[] args) {
        int[][] dizi = {{1, 2, 3}, {4, 5, 6}};
        int[][] transpozon = new int[dizi[0].length][dizi.length];

        for (int i = 0; i < dizi[0].length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                transpozon[i][j] = dizi[j][i];
            }
        }
        System.out.println("Original Matrix:");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpozon Matrix:");
        for (int i = 0; i < transpozon.length; i++) {
            for (int j = 0; j < transpozon[i].length; j++) {
                System.out.print(transpozon[i][j]+" ");
            }
            System.out.println();
        }
    }
}