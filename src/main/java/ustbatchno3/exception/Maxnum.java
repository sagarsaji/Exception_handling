package ustbatchno3.exception;

import java.util.ArrayList;
import java.util.Scanner;

public class Maxnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		int[] a = new int[5];
		int max = 0;
		ArrayList<Integer> num = new ArrayList();
		for(int i=0;i<5;i++) {
			a[i] = n.nextInt();
			num.add(a[i]);
		}
		for(int i=0;i<5;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}

}
