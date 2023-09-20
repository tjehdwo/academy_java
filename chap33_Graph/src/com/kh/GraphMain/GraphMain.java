package com.kh.GraphMain;

import com.kh.Practice.DFSGraph;

public class GraphMain {

	public static void main(String[] args) {
		int ver = 5;
		DFSGraph graph = new DFSGraph(ver);
		
		graph.addEdge(0,1); //노드 0에서 노드1로 방향이 있는 엣지를 추가
		graph.addEdge(0,2); //노드 0에서 노드2로 방향이 있는 엣지를 추가
		graph.addEdge(1,3);	//노드 1에서 노드3로 방향이 있는 엣지를 추가
		graph.addEdge(2,4); //노드 2에서 노드4로 방향이 있는 엣지를 추가
		
		System.out.println("DFS 탐색 결과 : ");
		
		// DFS 탐색을 시작할 노드의 번호를 전달
		//0으로 시작함
		graph.DFS(0);
		
	
	}

}
/*
DFS 탐색을 시작하여 그 결과를 출력
탐색 결과는 시작 노드에서 출발하여
깊이 우선으로 탐색 후 노드를 방문한 순서대로 출력
*/
