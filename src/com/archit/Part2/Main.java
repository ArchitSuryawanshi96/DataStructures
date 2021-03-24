package com.archit.Part2;

import com.archit.Part1.PriorityQueue;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Tree tree1 = new Tree();
//        tree1.insert(7);
//        tree1.insert(4);
//        tree1.insert(9);
//        tree1.insert(1);
//        tree1.insert(6);
//        tree1.insert(8);
//        tree1.insert(10);
//        tree1.traverseLevelOrder();
        //tree1.swapRoot();
//        var list = tree1.printNodesAtDistance(1);
//
//        for(var item: list)
//            System.out.println(item);

        //System.out.println(tree1.isBinarySearchTree());

//        Tree tree2 = new Tree();
//        tree2.insert(7);
//        tree2.insert(4);
//        tree2.insert(9);
//        tree2.insert(1);
//        tree2.insert(6);
//        tree2.insert(8);
//        tree2.insert(10);
//
//        System.out.println(tree1.equals(tree2));

//
//        AVLTree tree = new AVLTree();
//        tree.insert(30);
//        tree.insert(20);
//        tree.insert(10);

//
//    var heap = new Heap();
//    heap.insert(10);
//    heap.insert(30);
//    heap.insert(11);
//    heap.insert(9);
//    heap.insert(22);
//    heap.insert(21);
//    heap.remove();
//    heap.remove();
//        System.out.println("Done");


//        int[] numbers = { 5,3,4,1,2,9};
//        var heap = new Heap();
//        for (var number: numbers)
//            heap.insert(number);
//        // descending for (var i = 0; i< numbers.length;i++)
//        for (var i = numbers.length-1; i >= 0;i--)
//            numbers[i] = heap.remove();
//        System.out.println(Arrays.toString(numbers));

//        var queue = new PriorityQueue();
//        queue.add(30);
//        queue.add(20);
//        queue.add(10);
//        queue.add(5);
//        System.out.println(queue);

//        int[] numbers = { 5,3,8,4,1,2};
//        MaxHeap.heapify(numbers);
      //  System.out.println(Arrays.toString(numbers));

   //   System.out.println(MaxHeap.getKthLargest(numbers,8));
//
//        Trie trie = new Trie();
//        trie.insert("care");
//        trie.insert("car");
//        trie.insert("card");
//        trie.insert("careful");
        //trie.insert("cat");
      //  trie.traverse();
//        trie.remove("car");
//        System.out.println(trie.contains("car"));
//        System.out.println(trie.contains("care"));
        //System.out.println(trie.contains(""));

//        var words = trie.findWords("cargo");
//        System.out.println(words);

      //  var graph = new Graph();
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("C");
//        graph.addNode("D");
//        graph.addEdge("A", "B");
//        graph.addEdge("B", "D");
//        graph.addEdge("D", "C");
//        graph.addEdge("A", "C");

        //graph.traverseDepthFirst("G");
        //graph.traverseBreadthFirst("A");

       // graph.print();




//        graph.addNode("X");
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("P");
//        graph.addEdge("X", "A");
//        graph.addEdge("X", "B");
//        graph.addEdge("A", "P");
//        graph.addEdge("P", "A");
//
//        System.out.println(graph.hasCycle());

//        var list = graph.topologicalSort();
//        System.out.println(list);

//        WeightedGraph graph = new WeightedGraph();
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("C");
//        graph.addEdge("A", "B", 1);
//        graph.addEdge("A", "C", 10);
//        graph.addEdge("B", "C", 2);
//       // graph.print();
//        var path = graph.getShortestPath("A","C");
//        System.out.println(path);

//        WeightedGraph graph = new WeightedGraph();
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("C");
//        graph.addEdge("A", "B", 0);
//        graph.addEdge("B", "C", 0);
//        graph.addEdge("C", "A", 0);
//        System.out.println(graph.hasCycle());

        WeightedGraph graph = new WeightedGraph();
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("C");
//        graph.addNode("D");
//        graph.addEdge("A", "B", 3);
//        graph.addEdge("B", "D", 4);
//        graph.addEdge("C", "D", 5);
//        graph.addEdge("A", "C", 1);
//        graph.addEdge("B", "C", 2);
       // graph.print();
        var tree = graph.getMinimumSpanningTree();
        tree.print();


    }


}
