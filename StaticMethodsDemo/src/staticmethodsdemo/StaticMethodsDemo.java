/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticmethodsdemo;

/**
 *
 * @author Omar
 */
public class StaticMethodsDemo {

    public static void main(String[] args) {
        
        double[] a = {2.0, 5.0, 10.0, -1.0 };
        double output = StaticMethodsDemo.calculateAverage(a);
        System.out.println(output);
        
        output = StaticMethodsDemo.calculateAverage(10.0, 8.0);
        System.out.println(output);
        
        output = StaticMethodsDemo.calculateAverage(10.0, 8.0, 6.0);
        System.out.println(output);        
        
    }
    
    public static double calculateAverage(double[] a) {
        
        double sum = 0;
        
        if (a.length == 0){
            System.exit(0);
        }
            
        for(int i = 0; i<a.length; i++){
            sum += a[i];
        }
        
        return sum / a.length;
    }
    
    
    public static double calculateAverage(double num1, double num2) {
        return (num1 + num2) / 2.0;
    }
    
    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0;
    }
       
}
