/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaddress;

/**
 *
 * @author ae_hu
 */
public class PersonAddressDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PersonAddress p1 = new PersonAddress("Omar", "Acosta", "omardil.acosta@gmail.com", "8183592646");
        System.out.println("Name: " + p1.getFirstName());
        System.out.println("Last: " + p1.getLastName());
        System.out.println("Email: " + p1.getEmail());
        System.out.println("Telephone: " + p1.getTelephone());
        
        System.out.println("-------------");
        PersonAddress p2 = new PersonAddress("Maxi", "Meza",   "maxi.meza@rayados.com",    "8122335566");
        System.out.println("Name: " + p2.getFirstName());
        System.out.println("Last: " + p2.getLastName());
        System.out.println("Email: " + p2.getEmail());
        System.out.println("Telephone: " + p2.getTelephone());       

    }
    
}
