//NJABULO NCALA
//ST10490927


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;
import javax.swing.JOptionPane;

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
      
        
        Class_ASS user = new Class_ASS();
        Message mess = new Message();
          
        
        //enter password, username and phone number
       
           String username = JOptionPane.showInputDialog("Please enter your username: ");
           user.setUsername (username);
           String password = JOptionPane.showInputDialog("Please enter your Password: ");
           user.setPassword (password);
          String phone = JOptionPane.showInputDialog("Please your Phone Number");
          user.setPhone (phone);
       
        //password vaildation within a method 
      
        if (user.checkPasswordComplexity(password)) {
            JOptionPane.showInputDialog("Password suucessfully captured");
        } else {
           JOptionPane.showInputDialog("Password is not correctly formatted; please ensure that the password contains atleast eight characters, a capital letter, a number and a special character");
        }
    //checking the username
    if (user.checkUsername(username)) {
            JOptionPane.showInputDialog("Username succesfully captured");
        } else {
            JOptionPane.showInputDialog("Username is not correctly formatted; please ensure that your Username contains an underscore and is no more than five characters in length");
        }
    //checking the Phone number
    if (user.checkCellPhoneNumber(phone)) {
            JOptionPane.showInputDialog("Cell phone number successfully added");
        } else {
            JOptionPane.showInputDialog("Cell phone number incorrectly formatted or does not contain international code");
        }
    
            
            //input name and surname

  String name = JOptionPane.showInputDialog("Please enter Your Name: ");
  user.setName (name);

  String surname = JOptionPane.showInputDialog("Please enter your Surname: ");
  user.setSurname (surname);
  
    if(user.checkPasswordComplexity(password)){
         JOptionPane.showInputDialog("Welcome" + name + surname + "it is great to see you again." );
    }  else if (user.checkUsername(username)){
JOptionPane.showInputDialog("Welcome" + name + surname + "it is great to see you again." );
    }else {
    JOptionPane.showInputDialog("Username or password inncorrect, please try again ");
   }
    
     // the welcome message 
    JOptionPane.showMessageDialog(null,  "Welcome to QuickChat");
        
//creates a ID for the message
        
        String uniqueID = mess.generateUniqueID();
        JOptionPane.showMessageDialog(null,  "Unique ID:"  + uniqueID); 
    
// promting the user to choose between 1 to 3 
    
    int display =Integer.parseInt(JOptionPane.showInputDialog ("Enter numbers between 1 or 2 or 3:" ));
         switch(display){
            case 1:
                JOptionPane.showMessageDialog(null, "Send messages");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Coming soon ");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Quit");
                break;

         }  String menu;
                
        while (true) {
            menu = JOptionPane.showInputDialog(null, "Enter exit to close the form:");
            if ( menu == null ||menu.equalsIgnoreCase("Quit"))
              
            {
                break; 
            }
            JOptionPane.showMessageDialog(null,  "Please enter Quit!");
            JOptionPane.showMessageDialog(null,  "Goodbye"); 
        }
        //enter number and checked it has the correct format
        if (mess.checkRecipientCell(phone)) {
            JOptionPane.showInputDialog("Cell phone number successfully added");
        } else {
            JOptionPane.showInputDialog("Cell phone number incorrectly formatted or does not contain international code");
        }
//while loop for the message 
        
          String message = "";

        while (message == null || message.trim().isEmpty()) {
            message = JOptionPane.showInputDialog(null, "Please enter a message:");
        }

        JOptionPane.showMessageDialog(null, "You entered: " + message);
    
        
       


    
   //to check if the message is 250 characters or not
     String text = JOptionPane.showInputDialog("Please enter your Message: ");

        if (mess.vaildateMessage(text)) {
            JOptionPane.showInputDialog(null,"message is valid.");
        } else {
           JOptionPane.showInputDialog(null, "Invalid message. It must be exactly 250 characters long.");
        }
    // Message Hash
    
    String messageId = "0017";
    int messageNumber =0;
    String messageText = "greetings and How are you";
    String messagehash = mess.MessageHash(messageId, messageNumber, messageText);
    JOptionPane.showMessageDialog(null, "Message Hash" + messagehash);
    
 
    
        
       
        
       while (true) {
    int options = Integer.parseInt(JOptionPane.showInputDialog(" 1.Send Message 2.Coming soon 3. Quit"));

    switch (options) {
        case 1:
            JOptionPane.showMessageDialog(null, "Send Message!");
            System.exit(0);
            break;

        case 2:
            mess.menu(mess);
            break;

        case 3:
            JOptionPane.showMessageDialog(null,"Quit ");
            break;

        default:
            JOptionPane.showMessageDialog(null, "Invalid option.");
            String goodbye;
                
        while (true) {
            goodbye = JOptionPane.showInputDialog(null, "Enter exit to close the form:");
            if ( goodbye == null ||menu.equalsIgnoreCase("bye"))
              
            {
                break; 
            }
            JOptionPane.showMessageDialog(null,  "Please enter Quit!");
            JOptionPane.showMessageDialog(null,  "Goodbye"); 
    }
}
       }
    }
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
     
     
    
    
    
    

        
   



    




