public class SpringOrNot{
	public static void main(String args[]){
		int month=Integer.parseInt(args[0]);
		int day=Integer.parseInt(args[1]);
		SpringOrNot s=new SpringOrNot();
		System.out.println((s.check(month,day)?"Spring":"Not Spring"));
	}
	public boolean check(int month, int day){
		if(month<3 && month>6)
		return false;
		else if(month==3)
		return day>=20;
		else if(month==6)
		return day<=20;
		return true;
	}
}
