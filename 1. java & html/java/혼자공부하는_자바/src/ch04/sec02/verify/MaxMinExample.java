package ch04.sec02.verify;

import java.util.Scanner;

public class MaxMinExample {
	public static void main(String[] args){
		//3개의 정수 입력받아 가장 큰수
		//Scanner 클래스를 이용하여 키보드로부터 입력
		Scanner scanner = new Scanner(System.in);
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("i값 입력 : ");
		int i = scanner.nextInt();
		System.out.print("j값 입력 : ");
		int j = scanner.nextInt();
		System.out.print("k값 입력 : ");
		int k = scanner.nextInt();
		
		int max_value;
		if( i >= j) {
			if(i >= k) {
				max_value = i;
			} else {
				max_value = k;
			}
		} else {
			if(j>=k) {
				max_value = j;
			} else {
				max_value = k;
			}
		}
		
		int min_value;
		if( i <= j) {
			if(i <= k) {
				min_value = i;
			} else {
				min_value = k;
			}
		} else {
			if(j<=k) {
				min_value = j;
			} else {
				min_value = k;
			}
		}
		System.out.println("최댓값은 " + max_value + " 입니다." );
		System.out.println("최솟값은 " + min_value + " 입니다." );
	}
}
