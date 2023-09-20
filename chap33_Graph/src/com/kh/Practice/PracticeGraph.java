package com.kh.Practice;

public class PracticeGraph {

	public static void main(String[] args) {
		PracticeGraph pg = new PracticeGraph();
		pg.DFSpractice1();
		//pg.BFSpractice();
	}
	public void DFSpractice1() {
		int ver = 20;
		DFSGraph g = new DFSGraph(ver);
		
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
	
	public void DFSpractice2() {
		int ver = 10;
		DFSGraph g2 = new DFSGraph(ver);
		
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

	public void BFSpractice() {
		int ver = 10;
		BFSGraph g2 = new BFSGraph(ver);
		
		g2.addEdge(0, 1);
		g2.addEdge(0, 2);
		g2.addEdge(1, 4);
		g2.addEdge(1, 5);
		g2.addEdge(2, 3);
		g2.addEdge(2, 6);
		g2.addEdge(2, 7);
		g2.addEdge(4, 8);
		g2.addEdge(4, 9);
		g2.addEdge(5, 9);
		g2.addEdge(5, 7);
		
		System.out.println("BFS Å½»ö °á°ú : ");
		
		g2.BFS(0);
	}

}


