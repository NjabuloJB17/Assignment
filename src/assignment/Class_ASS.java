/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author RC_Student_lab
 */
public class Class_ASS {
      


private String password;
private String username;
private int phone;
private String name;
private String surname;


public void setUsername(String username){
        this.username = username;
    }
   
    public String getUsername(){
      return username;
    }
    
public void setPassword(String password){
        this.password = password;
    }
   
    public String getPassword(){
      return password;
    }

public void setPhone(int phone ){
        this.phone = phone;
    }
   
    public int getPhone(){
      return phone;
    }
public void setName(String name){
        this.name = name;
    }
   
    public String getName(){
      return name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
   
    public String getSurname(){
      return surname;
    }
    public boolean checkUsername(String username){
    String Uname = " [A-Za-z\\d@$!%*?&_]{0,5}$";
    
        Pattern pattern = Pattern.compile(Uname);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
}
   public  boolean checkPasswordComplexity(String password) {
        // Define the regex pattern for password validation
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,20}$";
        
        // Compile the pattern and match the password
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        
        // Return true if the password matches the pattern, false otherwise
        return matcher.matches();
    } // Method to validate the password

  public  boolean checkCellPhoneNumber(int phone) {
        // Define the regex pattern for password validation
        String cell = "^(?:\+27|0)(\d{9})$";
        
        // Compile the pattern and match the password
        Pattern pattern = Pattern.compile(cell);
        Matcher matcher = pattern.matcher(phone);
        
        // Return true if the password matches the pattern, false otherwise
        return matcher.matches();
    } // Method to validate the password
  
  public String RegisterUser(String username, String password){
      if(!checkUsername(username)){
        return "the Username is incorreclty formatted ";
      }else if (!checkPasswordComplexity(password)){
       return "The password does not meet the complexity reqirements ";
      }else{
         return "The two above conditions have been met, and the user has been registered successfully";
      }
  }
  
  public boolean loginUser(String secUsername, String secPassword){
      
      
      return secUsername.equals(this.username) && secPassword.equals(this.password);
  }
  public String returnLoginStatus (){
      
      
      return
  }
}  

