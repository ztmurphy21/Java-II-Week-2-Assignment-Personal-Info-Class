/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalinformationclass;

/**
 *
 * @author Zachary Murphy
 */
public class Person {
    private String name;
    private String address;
    private int age;
    private long phoneNumber;

    public Person(String name, String address, int age, long phoneNumber) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }


    
   
    public String getName(){
       return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public int getAge(){
        return age;
    }
    
    public long getPhoneNumber(){
        return phoneNumber;
    }
    
}
