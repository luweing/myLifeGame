package com.life;

public class Change {
	//随机生成初始形态
	public int[][] again(int x,int y){
		int [][]a=new int[x][y];
		for(int i=1;i<a.length-1;i++) {
			for(int j=1;j<a[i].length-1;j++) {
				if(Math.random()*100>95)
					 a[i][j]=1;	
			}
		}
		return a;
	}
	//判断周围细胞个数
	public static int number(int a[][],int x,int y) {
		int count=0;
		if(a[x-1][y]==1)
			count++;
		if(a[x][y-1]==1)
			count++;
		if(a[x+1][y]==1)
			count++;
		if(a[x][y+1]==1)
			count++;
		if(a[x-1][y+1]==1)
			count++;
		if(a[x+1][y-1]==1)
			count++;
		if(a[x-1][y-1]==1)
			count++;
		if(a[x+1][y+1]==1)
			count++;
		return count;
	}
	//细胞下一周期状态
	public static int[][] changeNext(int a[][]){
		int [][]b=a;
		for(int i=1;i<a.length-1;i++) {
			for(int j=1;j<a[i].length-1;j++) {
				if(number(a,i,j)==3)
					b[i][j]=1;
				else if(number(a, i, j)>3||number(a, i, j)<2)
					b[i][j]=0;
				else 
					b[i][j]=a[i][j];
			}
		}
		return b;
	}

}
