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
public class balance_the_equation {
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        String s = c.next();
        String ans="";
        String temp="";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(') st.push(s.charAt(i));
            else if(s.charAt(i)==')'&&!st.isEmpty())
            {
                if(temp.equals(""))
                {
                    ans=st.pop()+ans+")";
                }
                else
                {
                    ans=ans+st.pop()+temp+")";
                    temp="";
                }
            }
            else 
                if(!st.isEmpty())temp=temp+s.charAt(i);
        }
        
        System.out.println(ans);
    }
}
