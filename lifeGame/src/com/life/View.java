package com.life;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JFrame{
	private JButton [][]jbt;
	public View(int x,int y,int a[][]) {
		this.setSize(1000, 1000);
		jbt=new JButton[x][y];
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				jbt[i][j]=new JButton("2b");
				jbt[i][j].setBounds(10*i,j*10,1000/x,1000/y);
				if(a[i+1][j+1]==1)
					jbt[i][j].setBackground(Color.black);
				else
					jbt[i][j].setBackground(Color.white);
				this.add(jbt[i][j]);
			}
		}
		this.setVisible(true);
		
	}

}
