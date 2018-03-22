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
import java.io.File;
import java.util.Scanner;
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
            digit= nthDigitBack((countDigits(num))-n-1, num);
            /*for (int pos=countDigits(num); pos>=n; pos--)
            {
                
                digit= workingNum%10;
                workingNum=workingNum/10;
                }
            */
            return digit;
        }
    
    public static void updateTally(int n, int num, int[] tally){
        //untested but it should work, just determines the digit, and adds one to that index of the tally array.
        //you know, probably. I'll test it later :D
        
        tally[((nthDigit(n,num)))]+=1;
    
    }
    
    public static int[] nthDigitTally (int n, int[] nums)
    {
        int[] tally=new int[10];
        for(int workingNum:nums){
            updateTally(n,workingNum,tally);
        }
        return tally;
    }
        
    public static int[] readMysteriousNumbers(File dataSet)throws Exception{
        Scanner intReader = new Scanner(dataSet);
        int arraySize=0;
        int index=0;
        Scanner indexReader = new Scanner (dataSet);
        //while (whiteSpaceReader.hasNext(" ")){
        //    numWs++;
        //}
        
        
        while (indexReader.hasNext())
        {
            if (indexReader.hasNextInt())
            {
                arraySize++;
                indexReader.nextInt();
            }
            else{
                indexReader.next();
            }
        }
       int[] dataNums = new int[arraySize];
        while(intReader.hasNext())
            {
                if (intReader.hasNextInt())
                {
                    dataNums[index]=intReader.nextInt();
                    index++;
                    
                }
                else
                {
                    intReader.next();
                }
        }

        

                
        
        return dataNums;
        
    }
    
    public static void main(String[] args)throws Exception {
        
        
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
        
        int[] tally = new int[10];
        for (int member:tally)
        {
            System.out.print(member+" ");
        }
        updateTally(2,1072, tally);
        System.out.print("\n");
        for (int member:tally)
        {
            System.out.print(member+" ");
        }
         updateTally(2,1072, tally);
        System.out.print("\n");
        for (int member:tally)
        {
            System.out.print(+member+" ");
        }
        System.out.print("\n");
         updateTally(3,1072, tally);
        for (int member:tally)
        {
            System.out.print(member+" ");
        }
        
        int[] enrollments = {12176,5476,543,3490,24892,28619,2595,603,2527,1465,1858};
        int[] tallyResult= nthDigitTally(0,enrollments);
        for(int num:tallyResult)
        {
            System.out.print(num+ " ");
        }
        // TODO code application logic here
        
            File livejournal=new File ("livejournal.txt");

            int[] dataSet = readMysteriousNumbers(livejournal);

            
            /*for(int member:dataSet)
            {
                System.out.println(member);
            }*/
            
            for(int i=0; i<9; i++) //feeds dataset into digit tallyer, iterates from 1-9, 0 on far left, 9 on far right.
            {
                int [] numTally = nthDigitTally(i,dataSet);
                for( int member:numTally)
                {
                    System.out.print(member+" ");
                }
                System.out.println("counts of digit in" + i+ " pos");
            }


    
        
    }
}

 
 

        // TODO code application logic here
    
    
  
    

