package com.kh.Practice;

import com.kh.GraphMain.Graph;

public class PracticeGraph {

	public static void main(String[] args) {
		PracticeGraph pg = new PracticeGraph();
		//pg.practice1();
		pg.practice2();
	
	}
	public void practice1() {
		int ver = 20;
		Graph g = new Graph(ver);
		
		g.addEdge(0, 3);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 7);
		g.addEdge(2, 10);
		g.addEdge(7, 15);
		g.addEdge(7, 13);
		g.addEdge(2, 19);
		g.addEdge(2, 11);
		
		System.out.println("DFS Å½»ö °á°ú : ");
		
		g.DFS(0);
	}
	
	public void practice2() {
		int ver = 10;
		Graph g2 = new Graph(ver);
		
		g2.addEdge(0,2);
		g2.addEdge(0,4);
		g2.addEdge(0,6);
		g2.addEdge(2,9);
		g2.addEdge(2,5);
		g2.addEdge(4,6);
		g2.addEdge(4,7);
		g2.addEdge(4,8);
		
		
		System.out.println("DFS Å½»ö °á°ú : ");
		g2.DFS(0);
	}
}


