package com.revature.mdarrays;

public class twodarray {
    public static void main(String[] args) {
        int twoD[][] = new int[4][5];//4 rows with 5 columns
        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
                System.out.print( "0" + twoD[i][j] + " ");
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}

