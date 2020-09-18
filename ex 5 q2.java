/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author manoj
 */
public class q2 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        bankA b1=new bankA();
        System.out.println("Money deposited in bank A $"+b1.getBalance());
        bankB b2=new bankB();
        System.out.println("Money deposited in bank B $"+b2.getBalance());
        bankC b3=new bankC();
        System.out.println("Money deposited in bank C $"+b3.getBalance());

    }

}
class bank 
{
    int getBalance()
    {
        return 0;
    }
}
class bankA extends bank
{
    @Override
    int getBalance()
    {
        return 1400;
    }
}
class bankB extends bank
{
    @Override
    int getBalance()
    {
        return 1600;
    }
}
class bankC extends bank
{
    @Override
    int getBalance()
    {
        return 2000;
    }
}