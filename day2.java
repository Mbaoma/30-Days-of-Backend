import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import apple.laf.JRSUIConstants.Size;

class leapYears {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year:  ");
        Integer year = input.nextInt();
        System.out.print("Enter a range: ");
        Integer range = input.nextInt();
        ArrayList<Integer>  answer = new ArrayList<>();
        Integer count = 0;

        while (count != range){
            year = year + 1;
            if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
                
                System.out.println(year);
            }
            else{
                System.out.println("not leap year");
            }
            count++;
        }
    } 
}

