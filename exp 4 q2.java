/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4;
import DISTANCECONVERTER.CONVERTER;
import java.util.Scanner;
/**
 *
 * @author manoj
 */
public class Q2 {
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
      CONVERTER obj=new CONVERTER();
      System.out.println("Enter the value to be converted from meter to kilometer:");
      int a=in.nextInt();
      obj.mtokm(a);
      System.out.println("Enter the value to be converted from kilometer to meter:");
      int n=in.nextInt();
      obj.kmtom(n);
      System.out.println("Enter the value to be converted from miles to kilometer:");
      double h=in.nextDouble();
      obj.milesTokm(h);
       System.out.println("Enter the value to be converted from kilometer to miles:");
      double p=in.nextDouble();
      obj.kmTomiles(p);
    }
}