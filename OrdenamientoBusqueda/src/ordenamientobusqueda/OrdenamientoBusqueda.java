package ordenamientobusqueda;

/**
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
        
        if (array.length == 0)
            return -1;

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
    
    public static int[] findElementv3(int[] array, int key) {
        
        int count = 0;
        int[] matchArray;
        
        for (int i = 0; i < array.length; i++){
            if (array[i] == key ){
                count++;
            }
        }
        
        matchArray = new int[count];
        int matchArrayIndex = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                matchArray[matchArrayIndex++] = i;
            }
        }

        return matchArray;

    }    

}
