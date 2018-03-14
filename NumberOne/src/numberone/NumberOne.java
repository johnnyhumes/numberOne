/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberone;

/**
 *
 * @author John and Annalise
 */
public class NumberOne {

    public static int countDigits(int num){
        int count = 0;
        while(num > 0){
            num = num/10;
            count++;
        }
        
        return count;
    }
    public static int nthDigitBack (int n, int num){
            int digitBack=0;
            int workingNum=num;

            for (int pos=0; pos<=n; pos++)
            {
                //this works now
                digitBack= workingNum%10;
                workingNum=workingNum/10;
                }

            return digitBack;
        }
    
    public static int nthDigit (int n, int num){
            int digit;
            int workingNum=num;
            digit= nthDigitBack((countDigits(num))-n, num);
            /*for (int pos=countDigits(num); pos>=n; pos--)
            {
                
                digit= workingNum%10;
                workingNum=workingNum/10;
                }
            */
            return digit;
        }
    
    public static void updateTally(int n, int num, int[] tally){
    
    }
        
        
    
    public static void main(String[] args) {
        
        //some stuff to test stuff. very informative that.
        int digittest=12345;
        for (int i=0; i<countDigits(digittest)+1; i++)
        {
        System.out.println(nthDigitBack(i,digittest));
        }
        
        for (int i=0; i<=countDigits(digittest)+1; i++)
        {
        System.out.println("the "+ i +"th digit is "+nthDigit(i,digittest));
        }
        
        // TODO code application logic here
    }
    
  
    
}
