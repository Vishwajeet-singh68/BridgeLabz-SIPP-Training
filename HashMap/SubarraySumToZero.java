package HashMap;

import java.util.HashMap;

public class SubarraySumToZero {
    public static void main(String[] args) {
        int arr[]={1,-1,2,-2,3,4,-7};
        int sum=0,count=0;;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i:arr){
            sum+=i;
            if(map.containsKey(sum))
                count+=map.get(sum);
            
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(count);
    }
}
