package kr.ko.kosa.utils;

import java.util.Random;
import java.util.Scanner;


class Solution {
	static int AnswerN;
	static int N ;
	static String[][] pan  ; 
	public String randomChar;
	
	Random random = new Random();
	
	public String random() {
		
		int value =random.nextInt(3) + 1 ;
		randomChar = (value == 1) ? "Y" : ((value == 3) ? "l" : "H");
		
				
		return randomChar;
	}

	
	
	public void  seting() {
		pan = new String [N][N];
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j <N ; j++) {
				pan[i][j] = "L";
				System.out.print(pan[i][j]);
			}
			System.out.println();
		}
	}
	
	public void xseting() {
		int x = random.nextInt(N);
		int y = random.nextInt(N);
		pan[x][y] = "X";
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j <N ; j++) {
				System.out.print(pan[i][j]);
			}
			System.out.println();
		}
		
	}
	
	
	public void yseting() {
		int row=0, clomm=0;
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j <N ; j++) {
				if(pan[i][j] == "x") {
					row = i;
					clomm = j;
					System.out.println(i+", "+j);
					continue;
					
				}
				random();
				pan[i][row] = String.valueOf(randomChar); 
				random();
				pan[clomm][j] = String.valueOf(randomChar); 
				System.out.print(pan[i][j]);
			}
				System.out.println();
		}
	}
	

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		Solution solution = new Solution();
		
		int T = sc.nextInt();
		solution.N = sc.nextInt();
		int num = 0;
		
		
		

	
		
		
				
		for(int test_case = 1; test_case <= T; test_case++) {
			solution.seting();
			System.out.println();
			solution.xseting();
			System.out.println();
			solution.yseting();
			
			System.out.println("#"+test_case+" "+Solution.AnswerN);
		}
	}

}
