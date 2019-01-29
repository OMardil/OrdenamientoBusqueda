/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaddress;

/**
 * Consider a class PersonAdress that represents an entry in an address book.
 * Its attributes are:
 * - First name of the person
 * - Last name of the person
 * - Email address of the person
 * - Telephone number of the person
 * 
 * It will have methods to:
 * - Access each attribute
 * - Change the email address
 * - Change the telephone number
 * - Test whether two instances are equal based solely on name
 * 
 */

public class PersonAddress {
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    
    public PersonAddress(String firstName, String lastName, 
                         String email, String telephone){
        
        this.firstName = firstName;
        this.lastName  = lastName;
        this.email     = email;
        this.telephone = telephone;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
   
    public void setEmail(String email){
        this.email = email;
    }
   
    public String getEmail(){
        return this.email;
    }
    
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }
    
    public String getTelephone(){
        return this.telephone;
    }
    
    public boolean equals(PersonAddress a){
        boolean sameFirstName;
        boolean sameLastName;
        
        sameFirstName = this.firstName.equals(a.getFirstName());
        sameLastName  = this.lastName.equals(a.getLastName());
        
        if (sameFirstName  && sameLastName){
            return true;
        } else {
            return false;
        }
    }
}
