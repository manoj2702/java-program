/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SUM;

/**
 *
 * @author manoj
 */

public class Calculator 
{
   public void add(int a, int b){
       int c=a+b;
	System.out.println(" "+c);
   }
   public static void main(String args[]){
	Calculator obj = new Calculator();
	obj.add(10, 20);
   }
}