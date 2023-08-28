package dsa;

import java.util.Arrays;

public class ThreeSum {

	public static void solution(int[] arr, int target, int n) {
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			if(i==0 || (arr[i]!=arr[i-1])) {
				int tar = target - arr[i];
				int j = i + 1;
				int k = n - 1;
				
				while (j < k) {

					if (arr[j] + arr[k] == tar) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
						//ignoring the duplicates
						while(j<k && arr[j]==arr[j+1]) {
							j++;
						}
						while(j<k && arr[k]==arr[k-1]) {
							k--;
						}
						j++;
						k--;
					} else if (arr[j] + arr[k] < tar) {
						j++;
					} else {
						k--;
					}
				}

			}
			
		}

	}

	public static void main(String[] args) {
		int[] arr=new int[] {7,-6,3,8,-1,8,-11};
		int target=0;
		System.out.println("started");
		solution(arr, target, arr.length);
	}

}
