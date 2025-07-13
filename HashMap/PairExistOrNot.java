package HashMap;

import java.util.HashMap;

public class PairExistOrNot {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,3,5,3,6};
        int target=6;
        System.out.println("The Pair with sum equals to target "+(pairExistOrNot(arr, target)?"Exist":"do not Exist"));
    }
    public static boolean pairExistOrNot(int[]arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            int val=target-i;
            if(map.containsKey(val))
                return true;
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        return false;
    }
}
