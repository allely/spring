package coding;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] ac = a.toCharArray();
        for(int i = 0; i < ac.length; i++) {
        	if( 65 <= ac[i] && ac[i] <= 90 ) {
        		ac[i] = Character.toUpperCase(ac[i]);
        		
        	} else if (97 <= ac[i] && ac[i] <= 122){
        		ac[i] = Character.toLowerCase(ac[i]);
        	}
        }
        String changedA = String.valueOf(ac);
        System.out.println(changedA);
    }
}//?