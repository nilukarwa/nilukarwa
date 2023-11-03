public class MaximumStaircaseHeight{
	public static int height(int bs) {
		int h = 0;
		int currBs = 1;

		while (bs >= currBs) {
			h++;
			currBs += h + 1;
		}
		return h;
	}
	
	public static void main(String [] args){
		int blocks=10;
		System.out.print(height(blocks));
	}
}