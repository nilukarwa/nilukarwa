public class MaxProductPair {
    static void findMaxProductPair(int[] arr) {
        int len = arr.length;

        if (len < 2) {
            System.out.println("Unable to find a pair in an array having less than two elements");
            return;
        }
		
        int mx1 = Integer.MIN_VALUE, mx2 = Integer.MIN_VALUE;
        int mn1 = Integer.MAX_VALUE, mn2 = Integer.MAX_VALUE;

        for (int i = 0; i < len; i++) {
            if (arr[i] > mx1) {
                mx2 = mx1;
                mx1 = arr[i];
            }
			else{
				if (arr[i] > mx2)
					mx2 = arr[i];
            }

            if (arr[i] < mn1) {
                mn2 = mn1;
                mn1 = arr[i];
            }
			
			else{ 
				if (arr[i] < mn2)
					mn2 = arr[i];
            }
        }

        if (mx1 * mx2 > mn1 * mn2) {
            System.out.println(mx1 + ", " + mx2);
        } else {
            System.out.println(mn1 + ", " + mn2);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 8, 3, 6, 7, 0};
        int[] arr2 = {-1, -3, -6, 3, 0, -5};

        findMaxProductPair(arr1);
        findMaxProductPair(arr2);
    }
}