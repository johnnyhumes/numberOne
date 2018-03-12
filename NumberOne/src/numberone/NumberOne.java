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
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
