/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package st10423448;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class testLogin {
    
   @Test
   //Test checkUserName
   public void testCheckUserName()
   {
       Login Login = new Login();
       boolean expected= true;
       boolean actual = Login.checkUsername("Kyl_1");
       assertEquals(expected, actual, "Username succesfully captured");
   }
   @Test
    public void testCheckUserNameFail()
   {
       Login Login = new Login();
       boolean expected= false;
       boolean actual = Login.checkUsername("kyle!!!!!!!");
       assertEquals(expected, actual, "Username is not correctly formatted");
   }
    @Test
     //Test checkPassword
   public void testCheckPassword()
   {
       Login Login = new Login();
       boolean expected= true;
       boolean actual = Login.checkPassword("Ch&&sec@ke99!");
       assertEquals(expected, actual, "Password succesfully captured");
   }
   @Test
    public void testCheckPasswordFail()
   {
       Login Login = new Login();
       boolean expected= false;
       boolean actual = Login.checkPassword("password");
       assertEquals(expected, actual, "Password is not correctly formatted");
   }
    @Test
      // test isValidCellPhoneNumber
   public void testIsValidCellPhone()
   {
       Login Login = new Login();
       boolean expected= true;
       boolean actual = Login.isValidCellPhone("+27838968976");
       assertEquals(expected, actual, "Cell number succesfully captured");
   }
   @Test
    public void testIsValidCellPhoneFail()
   {
       Login Login = new Login();
       boolean expected= false;
       boolean actual = Login.isValidCellPhone("08966553");
       assertEquals(expected, actual, "Cell number is not correctly formatted");
   }
    @Test
    //Test LoginUser 
    public void testloginUser()
   {
       Login Login = new Login();
       boolean expected= true;
       boolean actual = Login.loginUser ("Kyl_1", "Ch&&sec@ke99!" ,"Kyl_1", "Ch&&sec@ke99!");
       assertEquals(expected, actual, "Welcome, it is great to see you again");
   }  
    @Test
     public void testloginUserFail()
   {
       Login Login = new Login();
       boolean expected= true;
       boolean actual = Login.loginUser ("Kyl_1", "Ch&&sec@ke99!" ,"Kyl_1", "Ch&&sec@ke99!");
       assertNotEquals(expected, actual, "Username or Password Inccorrect");
   }  
    
}
