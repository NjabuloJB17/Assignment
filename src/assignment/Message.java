/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.UUID;
import javax.swing.JOptionPane;
import org.json.JSONObject;


/**
 *
 * @author RC_Student_lab
 */
public class Message {
   private String message;  
  
   
   public void setMessage(String message){
        this.message = message;
    }
   
    public String getMessage(){
      return message;
     
    }
    private int number;
    public void setNumber (int number){
        this.number = number;
    }
    public int getNumber(){
        return number ;
    }
    private int hash;
    public void setHash (int hash){
        this.hash = hash; 
    }
      public int getHash() {
        return hash;
    }
    public static String limitString(String text) {
        if (text.length() > 250) {
            return text.substring(0, 250);
        } else {
            return text;
        }  
}
 

public static String generateUniqueID() {
        return UUID.randomUUID().toString();
    }
    
   public static String checkMessegeID(String message){
         
       if (message.length() <= 10) {
            return message.substring(0, 10);
        } else {
            return message;
   }

}
   
    public  boolean checkRecipientCell(String cel) {
        // Define the regex pattern for password validation
        String phone = "^\\+27\\d{9}$";
        
        // Compile the pattern and match the number
        Pattern pattern = Pattern.compile(phone );
        Matcher matcher = pattern.matcher(cel);
        
        // Return true if the password matches the pattern, false otherwise
        return matcher.matches();
        
    } 
    //creats the hash
    public static String createMessageHash(String messageId, int messageNumber, String messageText){
    String idNO = messageId.length()>= 2 ? messageId.substring(0, 2) : messageId;
    String[] letters = messageText.trim().split("\\s+");
    String Fword = letters.length > 0 ? letters[0] :"";
    String Lword = letters.length >1 ? letters[letters.length-1] : Fword;
    
    return idNO + ":" + messageNumber + ":" + (Fword + Lword).toUpperCase();
            
}
 // dispalys the 3 options  
    public static String SentMesage(){
           int display =Integer.parseInt(JOptionPane.showInputDialog ("Enter numbers between 1:to Send   or 2:To Store or 3:To Disregard :" ));
         switch(display){
            case 1:
                JOptionPane.showMessageDialog(null, "Send ");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Store ");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Diregard");
                break;
    
        
         }  String menu;
                
        while (true) {
            menu = JOptionPane.showInputDialog(null, "Enter exit to close the form:");
            if ( menu == null ||menu.equalsIgnoreCase("Quit"))
              
           
        return display(display) ;
        }       
    }
//validates the message
 public static boolean vaildateMessage(String id) {
        return id != null && id.length() == 250;
       
    }

         
// strores the message 
  public void storeMessage() {
        try {
            // Create JSON object
            JSONObject messageJson = new JSONObject();
            messageJson.put("messageID", message);
            messageJson.put("messageNumber", number);
            messageJson.put("sender", hash);
            

           
            String filename = "Message" + message + ".json";
            try (FileWriter file = new FileWriter(filename)) {
                file.write(messageJson.toJSONString());
                file.flush();
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Message Saving: " + e.getMessage() +JOptionPane.ERROR_MESSAGE);
        }
    }
 }
   

/* int number;

        for (;;) { // Infinite loop until the correct number is entered
             JOptionPane.showInputDialog(null, "Enter a number between 1 and 10: ");
            number = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your number "));

            if (number >= 1 && number <= 10) {
              JOptionPane.showMessageDialog(null,"Correct! You entered: " + number);
                break; // Exit the loop when the number is valid
            } else {
                JOptionPane.showMessageDialog(null,"Invalid number. Please try again.");
            


*/
























