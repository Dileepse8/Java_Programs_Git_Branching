package javaprograms;

public class S_Sum_Ele_Array_14 {

	public static void main(String[] args) {
		
		int a[]= {1,5,6,9,7};
		int sum=0;
		//m-1
		//for (int i = 0; i < a.length; i++) {
			//sum=sum+a[i];
			
		//}
		//System.out.println("sum is :" +sum);
		//m-2
		for (int val : a) {
			sum=sum+val;
		}
		System.out.println("sum is :" +sum);
		
		
	}
}
