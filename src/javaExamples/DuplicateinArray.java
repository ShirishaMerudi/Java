package javaExamples;

import java.util.HashSet;

public class DuplicateinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,2,1};
		HashSet<Integer> set = new HashSet<Integer>();
		int firstduplicate=0;
		for(int b:a) {
			if(!set.add(b)) {
				firstduplicate = b;
				break;
			}
		}
		System.out.println("First Duplicate element is :"+firstduplicate);

	}

}
