package contiguious_max_sum;

public class ConMaxSUm {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[]{1, 3, 4, -9, 11, 12, -1, 3};
		int max = 0;
		int start = 0;
		int end = 0;
		for (int i=0; i<numbers.length-1; i++){
			int temp_sum = 0;
			for(int j=i+1; j<=numbers.length-1; j++){
				temp_sum += numbers[j];
				if (temp_sum > max){
					max = temp_sum;
					start = i;
					end = j;
				}
			}
		}
		System.out.println("Sum : " + max + ", start : " + start + ", end : " + end);
		for(int i=start+1; i<=end; i++){
			System.out.print(numbers[i]+ " ");
		}
	} 

}
