/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho;
import java.util.*;
/**
 *
 * @author USER
 */
public class reverse_word_using_recursion {
    public static String print(String s)
    {
        int spaceIndex = s.indexOf(' ');

        if (spaceIndex == -1) {
            // If no space is found, the sentence has only one word, so return it
            return s;
        } else {
            // Recursively reverse the substring after the first space
            return print(s.substring(spaceIndex + 1)) + " " + s.substring(0, spaceIndex);
        }
    }
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        String s = c.nextLine();
        System.out.println(print(s));
    }
}
