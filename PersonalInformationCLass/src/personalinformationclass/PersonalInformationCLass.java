/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalinformationclass;

import java.util.Scanner;

/**
 *
 * @author Zachary Murphy
 */
public class PersonalInformationCLass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Person person1 = personInfo();
       Person person2 = personInfo();
       Person person3 = personInfo();
       
       //output of information for person 1
        System.out.println("Person Number One Information:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Address: " + person1.getAddress());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Phone: " + person1.getPhoneNumber());

        //Blank space to make output look neater...
        System.out.println("");

        //output of information for person 2 
        System.out.println("Person Number Two Information:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Address: " + person2.getAddress());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Phone: " + person2.getPhoneNumber());


        //Blank space to make output look neater...
        System.out.println("");  

        //output of inforation for person 3.
        System.out.println("Person Number Three Information:");
        System.out.println("Name: " + person3.getName());
        System.out.println("Address: " + person3.getAddress());
        System.out.println("Age: " + person3.getAge());
        System.out.println("Phone: " + person3.getPhoneNumber());    

       
        }
        
 public static Person personInfo(){
        //scanner for input use
        Scanner keyboard = new Scanner(System.in);

            
        
       System.out.println("Getting person info..");
       System.out.println("Enter name");
       String name = keyboard.nextLine();
       System.out.println("Enter address");
       String address = keyboard.nextLine();
       System.out.println("Enter age");
       int age = keyboard.nextInt();
       System.out.println("Enter phone number.");
       long phoneNumber = keyboard.nextLong();
        
       Person person = new Person (name, address, age, phoneNumber);
        
       return person;
       

 }
 
 }




     
     
        
        
        
    
    
  
   



