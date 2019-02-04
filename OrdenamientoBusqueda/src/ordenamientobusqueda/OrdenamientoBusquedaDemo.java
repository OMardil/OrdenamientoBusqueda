package ordenamientobusqueda;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Omar
 */
public class OrdenamientoBusquedaDemo {

    public static void main(String[] args) {
        
        pruebaCaso(1, new int[]{7, 3, 6, 8, 11, 15, 2, 1}, 15, 5);
        pruebaCaso(2, new int[]{7, 2, 1}, 2, 1);
        pruebaCaso(3, new int[]{7, 8, 11, 15, 2, 1}, 1, 5);
        pruebaCaso(4, new int[]{7}, 7, 0 );
        pruebaCaso(5, new int[]{2, 1}, 1, 1);
        pruebaCaso(6, new int[]{}, 1,-1);

        pruebaCaso(7, new int[]{7, 3, 6, 7, 11, 7, 2, 1}, 7, new int[]{0,3,5});
        pruebaCaso(8, new int[]{7, 2, 1}, 2, new int[]{1});
        pruebaCaso(9, new int[]{11, 11, 11, 15, 11, 1}, 11, new int[]{0,1,2,4});
        pruebaCaso(10, new int[]{7}, 7, new int[]{0});
        pruebaCaso(11, new int[]{2, 1}, 1, new int[]{1});
        pruebaCaso(12, new int[]{}, 1, new int[]{});    
    
    }

    public static void pruebaCaso(int testNum, int[] array, int buscar, int respuesta) {
        int a = 0;
        a = OrdenamientoBusqueda.findElementv2(array,buscar);
        if (a == respuesta) {
            System.out.println("Test #" + testNum + " :OK");
        } else {
            System.out.println("Test #" + testNum + " :ERROR");
        }
    }
    
    public static void pruebaCaso(int testNum, int[] array, int buscar, int[] respuesta) {
        int[] a;
        a = OrdenamientoBusqueda.findElementv3(array,buscar);
        if (compare(a, respuesta)) {
            System.out.println("Test #" + testNum + " :OK");
        } else {
            System.out.println("Test #" + testNum + " :ERROR");
        }
    }    
    
    public static boolean compare(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        
        return true;
        
    }
    
    
}
