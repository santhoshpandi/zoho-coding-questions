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
public class reverse_string_by_keeping_special_characters {
    public static boolean isAlphaNumeric(String s)
    {
        return s.matches("[A-Za-z0-9]+");
    }
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        String s = c.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
            if(isAlphaNumeric(s.substring(i,i+1))) st.push(s.charAt(i));
        for(int i=0;i<s.length();i++)
        {
            if(isAlphaNumeric(s.substring(i,i+1))) System.out.print(st.pop());
            else System.out.print(s.charAt(i));
        }
    }
}
