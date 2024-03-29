// An example Java program for demonstrating HashTable and HashMap

import java.util.Arrays;

class Teste {

    public static void main(final String[] args) throws java.lang.Exception {

        final int test_cases = 1;
        final int n = 7;
        final int[] a = new int[n];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
        a[6] = 7;

        findZigZagSequence(a, n);

    }

    public static void findZigZagSequence(final int[] a, final int n) {
        Arrays.sort(a);
        final int mid = (n - 1) / 2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n - 2;
        while (st <= ed) {
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }
        for(int i = 0; i < n; i++) {
            if(i > 0) {
                System.out.print(" ");
            }
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
