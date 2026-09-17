/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package st10423448;
import javax.swing.JOptionPane;

public class St10423448 {

    public static void main(String[] args) {
        //Part One
        //Register
        Login Login = new Login();
         String username="", password="", User="", Pass="",cellphone="";
         String[] optionn = {"Register", "Exit"};
        int registerPrompt = JOptionPane.showOptionDialog( null,"Choose an option:", "Custom Dialog", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,optionn,optionn[0]);
        if (registerPrompt == 1)
        {
            JOptionPane.showMessageDialog(null, "GoodBye");
            System.exit(0);
        }
        while (registerPrompt != 1)
        {
             while(!Login.checkUsername(username))
             {
                username = JOptionPane.showInputDialog(" Create a User Name\n (Must Be less than 5 characters and Contain a _) "); 
                if(Login.checkUsername(username))
                 {
                    JOptionPane.showMessageDialog(null, "Username succesfully captured ");
                 }
                else
                 {
                    JOptionPane.showMessageDialog(null, "Username is not correctly formatted ");
                 }
              }
             while(!Login.checkPassword(password))
             {
                password =  JOptionPane.showInputDialog("Create a Strong Password (With Numbers, Symbols and Letters) ");     
                if(Login.checkPassword(password))
                 {
                     JOptionPane.showMessageDialog(null, "Password succesfully captured ");
                 }
                else
                {
                    JOptionPane.showMessageDialog(null, "Password is not correctly formatted ");
                }
              }
             while(!Login.isValidCellPhone(cellphone))
             {
                 cellphone = JOptionPane.showInputDialog("Cell Number: ");
                 if(Login.isValidCellPhone(cellphone))
                {
                    JOptionPane.showMessageDialog(null, "Cell Number succesfully added ");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Cell Number is incorrectly formatted");
                }
              }
             if(Login.checkUsername(username) && Login.checkPassword(password) && Login.isValidCellPhone(cellphone))
             {
                JOptionPane.showMessageDialog(null, Login.registerUser(Login.checkUsername(username), Login.checkPassword(password)));
                registerPrompt=1;
             }
             else
             {
                registerPrompt = JOptionPane.showOptionDialog( null,"Choose an option:", "Custom Dialog", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,optionn,optionn[0]);
                if (registerPrompt != 1)
                    {
                         JOptionPane.showMessageDialog(null, "GoodBye");
                         System.exit(0);
                    }  
             }
             
        }
         
           
        //Login
        String[] options = {"Login", "Exit"};
        int loginPrompt = JOptionPane.showOptionDialog( null,"Choose an option:", "Custom Dialog", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
        if (loginPrompt == 1)
        {
            JOptionPane.showMessageDialog(null, "GoodBye");
            System.exit(0);
        }
        while (loginPrompt != 1) 
        {
            User = JOptionPane.showInputDialog("Enter your User Name: ");
            Pass = JOptionPane.showInputDialog("Enter your Password:  ");
            JOptionPane.showMessageDialog(null, Login.returnLoginStatus(Login.loginUser(username, password, User, Pass)));
            if(!Login.loginUser(username, password, User, Pass))
            {
               loginPrompt = JOptionPane.showOptionDialog( null,"Choose an option:", "Custom Dialog", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);    
                if (loginPrompt == 1)
                    {
                        JOptionPane.showMessageDialog(null, "GoodBye");
                        System.exit(0);
                    }
            }
            else
            {
                loginPrompt = 1;
                 JOptionPane.showMessageDialog(null, "Coming Soon, on DSTV");
                //Part Two
            }
          }
        
    }
}
