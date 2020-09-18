/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sub;

/**
 *
 * @author manoj
 */
public class test 
{
     public int subs(int a, int b){
       int c=a-b;
	System.out.println(" "+c);
        return c;
   }

   public static void main(String args[])
   {
	test obj = new test();
	obj.subs(40, 20);
   }
}
