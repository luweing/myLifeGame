package com.life;

public class Main {

	public static void main(String[] args) {
		Change change=new Change();
//		int [][]a=change.again(102, 102);
		int [][]a=new int[102][102];
		for(int i=10;i<71;i++) {
			a[i][40]=1;
			a[i][41]=1;
		}		
		while(true) {
			new View(100,100,a);
			a=Change.changeNext(a);
		}
		

	}

}
