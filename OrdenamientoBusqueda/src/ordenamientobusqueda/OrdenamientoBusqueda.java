package ordenamientobusqueda;

/**
 *
 * @author Omar
 */
public class OrdenamientoBusqueda {

    public static int findElement(int[] array, int key) {

        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }

        return -1;

    }

    public static int findElementv2(int[] array, int key) {

        for (int index1 = 0, index2 = array.length - 1;
                index1 < (array.length / 2) + 1;
                index1++, index2--) {

            if (key == array[index1]) {
                return index1;
            }

            if (key == array[index2]) {
                return index2;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int a = findElement(new int[]{7, 3, 6, 8, 11, 15, 2, 1}, 15);
        System.out.println(a);
        int b = findElementv2(new int[]{7, 3, 6, 8, 11, 15, 2, 1}, 15);
        System.out.println(b);

    }

}
