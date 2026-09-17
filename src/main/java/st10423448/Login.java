/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10423448;

import java.util.regex.Pattern;

public class Login {
     public static boolean checkUsername(String key){
        boolean checkName = key.contains("_") && key.length()<=5  ;   
        return checkName; 
    }
    public static boolean checkPassword(String key){
        boolean fact1 = false,fact2=false,fact3=false, fact;
        String specialChar="!@#$%^&*()_+{}:<>?|/*-+`~=[];'?/..,";
        String num="123456789";
        
        //loop to check password for special keys, numbers and Capital letter
        for(int x=0; x< key.length(); x++)
        {
            if(specialChar.contains(Character.toString(key.charAt(x))))
            {
                fact1 = true;
            }
             if(num.contains(Character.toString(key.charAt(x))))
            {
                fact2 = true;
            }
              if(Character.isUpperCase((key.charAt(x))))
            {
                fact3 = true;
            }
           
        }
        //check if length is above 8, and all other conditions are true
        if(fact1 && fact2 && fact3 && key.length()>=8)
        {
            fact =true;
        }
        else{  
        fact=false;
        }
        
        return fact;
    }
    public static boolean isValidCellPhone(String number) {
        String regex = "^\\+\\d{1,3}\\d{1,10}$";
        boolean match = Pattern.matches(regex, number)&& number.length() <= 13 && number.length() >= 10;
        return match;
    }
    
    public static String registerUser(boolean Name, boolean Password){
        String status = "";
        if(Name && Password){
            status = "User created ";
        }
        else{
          status = " Username, Cell Number and/or Password not correctly formated";
        }   
        return status;
        
    }
    public static boolean loginUser(String username, String password, String user, String pass){
        boolean login;
        if(username.compareTo(user)==0 && password.compareTo(pass)==0){
            login = true;
        }   
        else{
            login = false;
        }
        return login;
    }
    public static String returnLoginStatus(boolean loginStatus){
        String status = "Username or Password Inccorrect, Please try again";
        if(loginStatus==true){
           status = "Welcome, it is great to see you again";
        }
            return status;
       
        
    }
}
