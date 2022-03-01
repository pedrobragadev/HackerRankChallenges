// An example Java program for demonstrating HashTable and HashMap

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Teste {

    public static void countSwaps(final List<Integer> list, final Integer n) {

        Integer swapCount = 0;

        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for(int max = n - 1; max > 0; max--) {
                for(int i = 0; i < list.size() - 1; i++) {
                    final int left = list.get(i);
                    final int right = list.get(i + 1);
                    if(left > right) {
                        swapped = true;
                        ++swapCount;
                        list.set(i + 1, left);
                        list.set(i, right);
                    }
                }
            }
        }

        final Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
        final Optional<Integer> max = list.stream().max(Comparator.naturalOrder());

        System.out.println("Array is sorted in " + swapCount + " swaps.\n"
                + "First Element: " + min.get() + "\n"
                + "Last Element: " + max.get());
    }

    public static void main(final String[] args) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final int n = 4;

        final List<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);

        countSwaps(a, n);

        bufferedReader.close();
    }
}
