/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DISTANCECONVERTER;

/**
 *
 * @author manoj
 */
public class CONVERTER {
    public void mtokm(int a){
    int b=a/1000;
    System.out.println(a+"meters = "+b+"kilometers");
}

 public void kmtom(int a){
    int b=a*1000;
    System.out.println(a+"kilometers = "+b+"meters");
} 

 public void  milesTokm(double a) {
     double b=a*1.60934;
     System.out.println(a+"miles = "+b+"kilometers");  
    }

 public void  kmTomiles(double a) {
     double b=a*0.621371;
     System.out.println(a+"miles = "+b+"kilometers");  
    }
}