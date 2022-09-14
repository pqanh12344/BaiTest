/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String in = sc.nextLine();
        System.out.println(longest_string(in));
    }
    
    public static String longest_string(String s){
        String[] str = s.split(" "); // tách chuoi
        String longest = str[0];    
        
        // duyet chuoi
        for(String m: str){
            if(m.length() > longest.length()){
                longest = m;
            }
        }
        return longest;
    }
}
