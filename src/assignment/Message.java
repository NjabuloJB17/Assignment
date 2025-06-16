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
    public static String MessageHash(String messageId, int messageNumber, String messageText){
    String idNO = messageId.length()>= 2 ? messageId.substring(0, 2) : messageId;
    String[] letters = messageText.trim().split("\\s+");
    String Fword = letters.length > 0 ? letters[0] :"";
    String Lword = letters.length >1 ? letters[letters.length-1] : Fword;
    
    return idNO + ":" + messageNumber + ":" + (Fword + Lword).toUpperCase();
            
}
 // dispalys the 3 options  
    public static String SentMesage(){
           int display =Integer.parseInt(JOptionPane.showInputDialog ("Enter numbers between 1:to Send   or 2:To coming soon or 3:To Disregard :" ));
         switch(display){
            case 1:
                JOptionPane.showMessageDialog(null, "Send ");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "coming soon ");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Diregard");
                break;
    
        
         }  String menu;
                
       while (true) {
            menu = JOptionPane.showInputDialog(null, "Enter exit to close the form:");
            if ( menu == null ||menu.equalsIgnoreCase("Quit"))
              
           
        return "Quit" ;
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
    file.write(messageJson.toString());  // use toString() here
    file.flush();

            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Message Saving: " + e.getMessage() +JOptionPane.ERROR_MESSAGE);
        }
  }
    
          private String[] recipientNumbers;
    private String[] messages;
    private String[] messageID;
    private String[] Hash;
    private int messageCount;

    // Constructor
public Message() {
    int size = 250;
    recipientNumbers = new String[size];
    messages = new String[size];
    messageID = new String[size];
    Hash = new String[size];
    messageCount = 0;
}
   
   // Store the message
    public void storeMessage(String recipient, String message) {
        if (messageCount < recipientNumbers.length) {
            recipientNumbers[messageCount] = recipient;
            messages[messageCount] = message;
            messageID[messageCount] = "MSG" + messageCount;
            Hash[messageCount] = UUID.randomUUID().toString().substring(0, 8);
            messageCount++;
        } else {
            JOptionPane.showMessageDialog(null, "Message storage limit reached.");
        }
    }

    // Display all messages
    public void displayAllMessages() {
        if (messageCount == 0) {
            JOptionPane.showMessageDialog(null, "No messages stored.");
            return;
        }

        String report = "All Messages:";
        for (int i = 0; i < messageCount; i++) {
            report = report + "ID: " + messageID[i] + "Recipient: " + recipientNumbers[i] + "Message: " + messages[i]+ " Hash: " + Hash[i];
        }

        JOptionPane.showMessageDialog(null, report);
    }

    // Find longest message
    public void longestMessage() {
        if (messageCount == 0) {
            JOptionPane.showMessageDialog(null, "No messages available.");
            return;
        }

        int longest = 0;
        for (int i = 1; i < messageCount; i++) {
            if (messages[i].length() > messages[longest].length()) {
                longest = i;
            }
        }

        String result = "Longest Message:" + "ID: " + messageID[longest] + "Recipient: " + recipientNumbers[longest] + "Message: " + messages[longest];
        JOptionPane.showMessageDialog(null, result);
    }

    // Search by Message ID
    public void searchMessageID(String id) {
        for (int i = 0; i < messageCount; i++) {
            if (messageID[i].equalsIgnoreCase(id)) {
                String result = "Message Found:"+ "Recipient: " + recipientNumbers[i]+ "Message: " + messages[i]+ "Hash: " + Hash[i];
                JOptionPane.showMessageDialog(null, result);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No message found with ID: " + id);
    }

    // Search by Recipient
    public void searchRecipient(String number) {
        boolean found = false;
        String report = "";

        for (int i = 0; i < messageCount; i++) {
            if (recipientNumbers[i].equalsIgnoreCase(number)) {
                report = report + "ID: " + messageID[i] + "Message: " + messages[i]+ "Hash: " + Hash[i];
                found = true;
            }
        }

        if (found) {
            JOptionPane.showMessageDialog(null, "Messages for recipient:" + report);
        } else {
            JOptionPane.showMessageDialog(null, "No messages found for recipient: " + number);
        }
    }

    // Delete by Hash
    public void deleteMessageHash(String deleteHash) {
        for (int i = 0; i < messageCount; i++) {
            if (Hash[i].equals(deleteHash)) {
                for (int j = i; j < messageCount - 1; j++) {
                    recipientNumbers[j] = recipientNumbers[j + 1];
                    messages[j] = messages[j + 1];
                    messageID[j] = messageID[j + 1];
                    Hash[j] = Hash[j + 1];
                }
                messageCount--;
                JOptionPane.showMessageDialog(null, "Message with hash " + deleteHash + " deleted.");
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "No message found with hash: " + deleteHash);
    }

    // Generate Report
    public void generateReport() {
        if (messageCount == 0) {
            JOptionPane.showMessageDialog(null, "No messages to report.");
            return;
        }

        String report = "Message Report:";
        for (int i = 0; i < messageCount; i++) {
            report = report + "ID: " + messageID[i]+ " To: " + recipientNumbers[i]+ " Message: " + messages[i]+ "Hash: " + Hash[i];
        }

        JOptionPane.showMessageDialog(null, report);
    }

 

   // switch case for the functions 
   public static void menu(Message mes) {
    while (true) {
        int options = Integer.parseInt(JOptionPane.showInputDialog( "Enter a number 1 to 7"));

        

        switch (options) {
            case 1:
                mes.displayAllMessages();
                break;
            case 2:
                mes.longestMessage();
                break;
            case 3:
                String id = JOptionPane.showInputDialog("Enter Message ID:");
                mes.searchMessageID(id);
                break;
            case 4:
                String rec = JOptionPane.showInputDialog("Enter Recipient Number:");
                mes.searchRecipient(rec);
                break;
            case 5:
                String hash = JOptionPane.showInputDialog("Enter Message Hash:");
                mes.deleteMessageHash(hash);
                break;
            case 6:
                mes.generateReport();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid option.");
        }

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
























