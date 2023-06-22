/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_2019_027;

/**
 *
 * @author Alamgir
 */
public class LCS {
    int lcs(char[] X, char[] Y, int m, int n) {
        if (m == 0 || n == 0)
            return 0;
        if (X[m - 1] == Y[n - 1])
            return 1 + lcs(X, Y, m - 1, n - 1);
        else
            return max(lcs(X, Y, m, n - 1), lcs(X, Y, m - 1, n));
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public void run() {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        System.out.println("Given strings are S1: "+s1+"\t S2:"+s2);
        System.out.println("Length of LCS is"
                + " " + lcs(X, Y, m, n));
    }
}
