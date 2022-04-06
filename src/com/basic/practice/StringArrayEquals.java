package com.basic.practice;


public class StringArrayEquals {

	public static void main(String[] args) {
     //   Scanner sc= new Scanner(System.in);		
        String word1[]= new String[] {"ab","c"};
        String word2[] = new String[] {"a","bc"};
        StringArrayEquals.arrayStringsAreEqual(word1, word2);
		

	}
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String s1 = new String("");
		String s2 = new String("");
		for(int i =0;i<word1.length;i++) {
			s1 = s1+word1[i];
		}
		for(int i =0;i<word2.length;i++) {
			s2 = s2+word2[i];
		}
		if(s1.equals(s2)) {
			return true;
			
		}
		else {
        return false;
		}
        
    }

}
