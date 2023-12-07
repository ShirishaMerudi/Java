package javaExamples;

import java.util.HashSet;

public class UniqueinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,2,1};
		HashSet<Integer> set = new HashSet<Integer>();
		int firstunique=0;
		for(int b:a) {
			if(set.add(b)) {
				firstunique = b;
				break;
			}
		}
		System.out.println("First Unique element is :"+firstunique);

	}

}
