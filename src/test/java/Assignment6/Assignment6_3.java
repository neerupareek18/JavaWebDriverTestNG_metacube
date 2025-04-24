package Assignment6;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Assignment6_3 {

    @Test
    public void isPalindrome(){
        boolean isPalindrome=true;
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Write the input string");
        //String input = scanner.nextLine();
        String input = "@1abcbA1@";
        input = input.toLowerCase();

        for(int i=0;i<input.length()/2;i++){
            if(input.charAt(i)!=input.charAt(input.length()-1-i)){
              isPalindrome=false;
            }
        }
        if(isPalindrome)
            System.out.println("String is Palindrome");
        else
            System.out.println("String is not Palindrome");

    }
}
