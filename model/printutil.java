import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
package model;
public class PrintUtil {

    private PrintUtil() {}

    public static void printList(List<?> list) {
        if (list == null) return;
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static <T> void printList(T[] array) {
        if (array == null) return;
        for (T item : array) {
            System.out.println(item);
        }
    }

    public static void printPrintableList(List<? extends Printable> list) {
        if (list == null) return;
        for (Printable item : list) {
            System.out.println(item.getPrintDetail());
        }
    }

    public static <T extends Printable> void printPrintableList(T[] values) {
        if (values == null) return;
        for (T item : values) {
            System.out.println(item.getPrintDetail());
        }
    }

    public static <T extends Comparable<? super T>> void printListSorted(List<T> list) {
        if (list == null) return;
        List<T> copy = new ArrayList<>(list);
        Collections.sort(copy);
        printList(copy);
    }

    public static <T extends Comparable<? super T>> void printListSorted(T[] array) {
        if (array == null) return;
        T[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy);
        printList(copy);
    }
}