//BoO(“Micheal Jackson”)=== “Please remove all spaces or special characters”
//BoO(“Micheal”)=== “It is nice to meet you, Micheal”;
//BoO(“Bolu”)=== “Welcome back, Bolu”;

import java.util.*;  
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class singleString{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);   
        System.out.print("Enter a string: ");
        String user_input= sc.nextLine();  
        Pattern p = Pattern.compile("[^a-z0-9'']", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(user_input);
        boolean res = m.find();
   
        if(res){
            System.out.println("Please remove all spaces or special characters");
        }
        else if (user_input == "Bolu" || user_input == "Odun" ){
            System.out.println("Welcome back, " +user_input);
        } else {
            System.out.println("It is nice to meet you, " +user_input); 
        }
    }
}