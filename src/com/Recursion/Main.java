package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Reverse(str);
    }
    public static void Reverse(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        String rev="";
        for(int i=0;i<str.length();i++){
            rev = rev + stack.pop();
        }
        System.out.println(rev);
    }
}
