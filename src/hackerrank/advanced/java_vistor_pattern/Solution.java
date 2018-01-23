package hackerrank.advanced.java_vistor_pattern;

import java.util.ArrayList;
import java.io.*;
import java.util.*;

import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis {
    public abstract int getResult();

    public abstract void visitNode(TreeNode node);

    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    private int sum = 0;

    /*
        The SumInLeavesVisitor implementation must return the sum of the values in the tree's leaves only.
    */
    public int getResult() {
        //implement this
        return sum;
    }

    public void visitNode(TreeNode node) {
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        sum += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private long product = 1;
    private final int modulo = 1000000007;

    /*
        The ProductRedNodesVisitor implementation must return the product of values stored in all red nodes,
        including leaves, computed modulo 10^9+7. Note that the product of zero values is equal to 1.
    */
    public int getResult() {
        //implement this
        return (int) product;
    }

    public void visitNode(TreeNode node) {
        //implement this
        if (node.getColor() == Color.RED) {
            product = (product * node.getValue()) % modulo;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        if (leaf.getColor() == Color.RED) {
            product = (product * leaf.getValue()) % modulo;
        }
    }
}

class FancyVisitor extends TreeVis {
    private int evenNodes = 0;
    private int greenLeafs = 0;

    /*
        The FancyVisitor implementation must return the absolute difference between the sum
        of values stored in the tree's non-leaf nodes at even depth and the sum of values
        stored in the tree's green leaf nodes. Recall that zero is an even number.
    */
    public int getResult() {
        //implement this
        return Math.abs(evenNodes - greenLeafs);
    }

    public void visitNode(TreeNode node) {
        //implement this
        if (node.getDepth() % 2 == 0) {
            evenNodes += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        if (leaf.getColor() == Color.GREEN) {
            greenLeafs += leaf.getValue();
        }
    }
}

public class Solution {

    static class Vertex {
        int id;
        int value;
        Color color;
        Vertex parent;
        Set<Vertex> adjacentVertices = new HashSet<>();

        public Vertex(int id) {
            this.id = id;
        }

        int getDepth() {
            int depth = 0;
            Vertex cur = this;
            while ((cur = cur.parent) != null) {
                depth++;
            }
            return depth;
        }

        public boolean isLeaf() {
            return adjacentVertices.size() == 0;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vertex vertex = (Vertex) o;
            return id == vertex.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }

    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function

        // Read the n-node tree, where each node is numbered from 1 to n. The tree is given
        // as a list of node values (1..n), a list of node colors (1..n), and a list of edges.
        // Construct this tree as an instance of the Tree class. The tree is always rooted at node number 1.

        Scanner sc = new Scanner(System.in);

        int nodeCount = sc.nextInt();
        int edgePairsCount = (nodeCount - 1) * 2;

        Vertex[] vertices = initVerticesArray(nodeCount);

        int[] values = getIntArrayFromScanner(sc, nodeCount);
        fillNodeValues(vertices, values);

        int[] colors = getIntArrayFromScanner(sc, nodeCount);
        fillNodeColors(vertices, colors);

        int[] edgeData = getIntArrayFromScanner(sc, edgePairsCount);
        fillEdges(vertices, edgeData);

        sc.close();

        fillParents(vertices[0]);
        return buildTree(vertices[0]);
    }

    private static Vertex[] initVerticesArray(int count) {
        Vertex[] vertices = new Vertex[count];
        for (int i = 0; i < count; i++) {
            vertices[i] = new Vertex(i);
        }
        return vertices;
    }

    private static int[] getIntArrayFromScanner(Scanner sc, int count) {
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = sc.nextInt();
        }
        return result;
    }

    private static void fillNodeValues(Vertex[] vertices, int[] values) {
        for (int i = 0; i < vertices.length; i++) {
            vertices[i].value = values[i];
        }
    }

    private static void fillNodeColors(Vertex[] vertices, int[] values) {
        for (int i = 0; i < vertices.length; i++) {
            vertices[i].color = values[i] == 1 ? Color.GREEN : Color.RED;
        }
    }

    private static void fillEdges(Vertex[] vertices, int[] values) {
        for (int i = 0; i < values.length; i += 2) {
            int edgeVertexIndexFrom = values[i] - 1;
            int edgeVertexIndexTo = values[i + 1] - 1;
            vertices[edgeVertexIndexFrom].adjacentVertices.add(vertices[edgeVertexIndexTo]);
            vertices[edgeVertexIndexTo].adjacentVertices.add(vertices[edgeVertexIndexFrom]);
        }
    }

    private static void fillParents(Vertex vertex) {
        for (Vertex adjacentVertex : vertex.adjacentVertices) {
            if (adjacentVertex.parent == null) {
                adjacentVertex.parent = vertex;
                adjacentVertex.adjacentVertices.remove(vertex);
                fillParents(adjacentVertex);
            }
        }
    }

    private static Tree buildTree(Vertex vertex) {
        Tree tree = createTreeNode(vertex);
        for (Vertex adjacentVertex : vertex.adjacentVertices) {
            ((TreeNode) tree).addChild(buildTree(adjacentVertex));
        }
        return tree;
    }

    private static Tree createTreeNode(Vertex vertex) {
        if (vertex.isLeaf()) {
            return new TreeLeaf(vertex.value, vertex.color, vertex.getDepth());
        }
        return new TreeNode(vertex.value, vertex.color, vertex.getDepth());
    }

    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input/tree_input10.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}