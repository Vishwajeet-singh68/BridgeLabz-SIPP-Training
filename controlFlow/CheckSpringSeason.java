package controlFlow;

public class CheckSpringSeason{
    public static void main(String[] args){
        if(args.length!=2){
            System.out.println("Please provide month and day as command line arguments");
            return;
        }
        int month=Integer.parseInt(args[0]);
        int day=Integer.parseInt(args[1]);
        if((month==3&&day>=20)||(month==4)||(month==5)||(month==6&&day<=20)){
            System.out.println("Its a Spring Season");
        }else{
            System.out.println("Not a Spring Season");
        }
    }
}

