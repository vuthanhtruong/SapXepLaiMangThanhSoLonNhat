package dsfsdf;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class vuthanhtruong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=new Scanner(System.in).nextInt();
		String M[][]=new String[n][n];
		int count=0;
		System.out.println("Mời bạn chọn vị trí của cờ");
		if(n<=4) {
			System.out.println("Mời bạn chọn vị trí của con hậu: ");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i==0 || j==n-1 || i+1==n-j) {
						M[i][j]="*";
						count++;
					}
					else {
						M[i][j]=" ";
					}
				}
			}
		}
		else {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i+1==n-j || j==n/2-1 || i==n/2 || j==i-1) {
						M[i][j]="*";
						count++;
					}
					else {
						M[i][j]=" ";
					}
				}
			}
		}
		
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(M[i][j]);
			}
			System.out.println();
		}
		
		
		System.out.println(count-1);

	}
	

}