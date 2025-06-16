package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long number=in.nextLong();
        int maxDigit=10,index=0;
        int digitArary[]=new int[maxDigit];
        while(number>0){
            int digit=(int)(number%10);
            digitArary[index++]=digit;
            number/=10;
            if(index==maxDigit){
                maxDigit=maxDigit*2;
                int temp[]=new int[maxDigit];
                for(int i=0;i<maxDigit/2;i++){
                    temp[i]=digitArary[i];
                }
                digitArary=temp;
            }
        }
        int largest=-1,secondLargest=-1;
        for(int i:digitArary){
            if(i>largest){
                secondLargest=largest;
                largest=i;
            }
            else{
                secondLargest=Math.max(secondLargest,i);
            }
        }
        System.out.println("Largest digit is "+largest+" and the second largest is "+secondLargest);
    }
    
}
