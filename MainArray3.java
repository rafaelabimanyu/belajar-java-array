public class Array3 {
    private int[][] matriksA;
    private int[][] matriksB;
    private double[][] matriksC;

    public void setMatriksA(int[][] A) {
        this.matriksA = A;
    }

    public void setMatriksB(int[][] B) {
        this.matriksB = B;
    }

    public int[][] getMatriksA() {
        return matriksA;
    }

    public int[][] getMatriksB() {
        return matriksB;
    }

    public void jumlahkanMatriks() {
        int baris = matriksA.length;
        int kolom = matriksA[0].length;
        matriksC = new double[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriksC[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }
    }

    public double[][] getMatriksC() {
        return matriksC;
    }

    public void kaliMatriks(double skalar) {
        if (matriksC == null) {
            System.out.println("Error: Matriks C belum dihitung!");
            return;
        }

        int baris = matriksC.length;
        int kolom = matriksC[0].length;

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriksC[i][j] *= skalar;
            }
        }
    }

    public void tampilkanMatriks(String nama, double[][] data) {
        System.out.println(nama);
        for (double[] row : data) {
            for (double num : row) {
                System.out.printf("%.2f\t", num);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void tampilkanMatriks(String nama, int[][] data) {
        System.out.println(nama);
        for (int[] row : data) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
