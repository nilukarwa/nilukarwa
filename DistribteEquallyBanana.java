public class DistribteEquallyBanana{
	public static void main(String [] args){
		int num=6;
		System.out.println(distribute (num));
	}
	
	public static boolean distribute(int num){
		if(num<=0 || num<=1)
			return false;
		
		for(int i=2;i<num;i++){
			if(num % i == 0)
				return true;
		}
		return false;
	}
}