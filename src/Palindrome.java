 import java.util.*;
 class Palindrome {
    // Function to reverse a string and check if a given string is a palindrome
    public boolean reverseString_and_PalindromeCheck(String s) {              
        int right = s.length() - 1; 
        String revString = "";
        // Iterate while start pointer is less than end pointer
        while (right>=0) {
            // storing reverse string
        	revString = revString + s.charAt(right); 
            --right;  
        
        }
        if(revString.equalsIgnoreCase(s))
        	return true;
        
        return false;
        
    }

    public static void main(String[] args) {
    	Scanner sc  = new Scanner(System.in);
        Palindrome solution = new Palindrome();
        System.out.println("Enter string ");
        String str = sc.nextLine();  

        if (solution.reverseString_and_PalindromeCheck(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
