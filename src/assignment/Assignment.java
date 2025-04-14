/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
         Scanner input = new Scanner(System.in);
        Class_ASS user = new Class_ASS();

          
        
        //
        System.out.print("Please enter your username: ");
           String username = input.nextLine();
           user.setUsername (username);
           System.out.println("Please enter your Password: ");
           String password = input.nextLine();
           user.setPassword (password);
          System.out.print("Please your Phone Number");
          String phone = input.nextLine();
          user.setPhone (phone);
        
 //password vaildation within a method 
       //fgshfsh String password = "Password123!"; // Example password
        //while
        if (user.checkPasswordComplexity(password)) {
            System.out.println("Password suucessfully captured");
        } else {
            System.out.println("Password is not correctly formatted; please ensure that the password contains atleast eight characters, a capital letter, a number and a special character");
        }
    
    if (user.checkUsername(username)) {
            System.out.println("Username succesfully captured");
        } else {
            System.out.println("Password is not correctly formatted; please ensure that your Username contains an underscore and is no more than five characters in length");
        }
    if (user.checkCellPhoneNumber(phone)) {
            System.out.println("Cell phone number successfully added");
        } else {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code");
        }
    
            
            //
  System.out.print("Please enternYour Name: ");
  String name = input.nextLine();
  user.setName (name);
  System.out.print("Please enter your Surname: ");
  String surname = input.nextLine();
  user.setSurname (surname);
  
    if(user.checkPasswordComplexity(password)){
         System.out.print("Welcome" + name + surname + "it is great to see you again." );
    }  else if (user.checkUsername(username)){
    System.out.print("Welcome" + name + surname + "it is great to see you again." );
    }else 
    System.out.print("Username or password inncorrect, please try again ");
   }
       
}
   

