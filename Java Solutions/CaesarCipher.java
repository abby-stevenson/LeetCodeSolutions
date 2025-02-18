import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public static String caesarCipher(String s, int k) {
    // Write your code here
    String result = "";
    for (int i = 0; i < s.length(); i ++) {
        char character = s.charAt(i);
        int asciiValue = (int) character;
        if (asciiValue >= 97 && asciiValue <= 122 
        || asciiValue >= 65 && asciiValue <= 90){
            char base = Character.isUpperCase(character) ? 'A' : 'a';
            char newCharacter = (char) (base + (character - base + k) % 26);
            result = result + newCharacter; 
        }
        else {
            result = result + s.charAt(i);
        }
    }

}