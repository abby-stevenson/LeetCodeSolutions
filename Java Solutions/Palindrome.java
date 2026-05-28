public class Palindrome {

    /*
     * Complete the 'isAlphabeticPalindrome' function below.
     *
     * The function is expected to return a BOOLEAN.
     * The function accepts STRING code as parameter.
     */

    public static boolean isAlphabeticPalindrome(String code) {
    // Write your code here
    //Loop through the code and extra those with asci values 65 to 90 or 97 to 122
    //If its 65 to 90 convert to lowercase and add it to the new string 
    //If it is 97 to 122 just add it to the new string 
    if (code.isEmpty()) {
        return true;
    }
    String lowerCode = code.toLowerCase();
    String newString = "";
    for (int i = 0; i < lowerCode.length(); i++) {
        int ascii = lowerCode.charAt(i);
        if (ascii >= 97 && ascii <= 122 ) {
            char c = (char)ascii;
            newString = newString + c;
        }
    }
    if (newString.isEmpty()) {
        return true;
    }
    int length = newString.length();
    for (int j = 0; j < length; j++){
          if (j == (length - j)) {
            return true;
        }
        if (newString.charAt(j) != newString.charAt(length - 1 - j)) {
            return false;
        }
      
    }
    return true;

    }
    
}
