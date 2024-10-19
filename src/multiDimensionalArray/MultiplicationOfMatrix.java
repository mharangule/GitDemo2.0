package multiDimensionalArray;

public class MultiplicationOfMatrix {
	public static void main(String[] args) {
		int a[][] = { { 4, 2, 0 }, { 1, 7, 6 }, { 3, 5, 8 } };
		int b[][] = { { 4, 2, 0 }, { 1, 7, 6 }, { 3, 5, 8 } };
		printMatrix(a);
		System.out.println("-----------------------------------");
		printMatrix(b);
		int c[][]=multiplymatrix(a, b);
		System.out.println("-----------------------------------");
		printMatrix(c);
	}

	public static int[][] multiplymatrix(int[][] a, int[][] b) {
		int c[][] = new int[3][3];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = 0;
				for (int k = 0; k < c.length; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}

	public static void printMatrix(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}
