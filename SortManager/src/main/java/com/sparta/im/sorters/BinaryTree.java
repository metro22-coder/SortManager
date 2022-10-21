package com.sparta.im.sorters;



import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;

public class BinaryTree implements BinartyTr {

    private final Node rootNode;

    public BinaryTree(int element) {
        this.rootNode = new Node(element);
    }

    @Override
    public int getRootElement() {
        return this.rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return 0;
    }

    @Override
    public void addElement(int element) {
        addNodeToTree(rootNode, element);

    }

    private void addNodeToTree(Node node, int element) {
        if (element < node.getValue()) {
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        }else if(node.isRightChildEmpty()){
            node.setRightChild(new Node(element));
            int numberOfNodes = 0;
            numberOfNodes++;
        }else{
            addNodeToTree(node.getRightChild(),element);
        }
    }

    @Override
    public void addElements(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            addElement(elements[i]);
        }

    }

    public boolean findElement(int element) {
        Node node = findNode(element);
        if (node != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getLeftChild(int element) {
        return 0;
    }

    @Override
    public int getRightChild(int element) {
        return 0;
    }

    @Override
    public int[] getSortedTreeAsc() {
        ArrayList<Integer> x = new ArrayList<>();
        storeInOrder(rootNode, x);
        return x.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void storeInOrder(Node root1, List<Integer> arr1) {
        storeInOrderRecursive(root1, arr1, 0);
    }

    private static Integer storeInOrderRecursive(Node root1, List<Integer> arr1, int index) {
        if (root1 == null) {
            return index;
        }

        index = storeInOrderRecursive(root1.getLeftChild(), arr1, index);
        arr1.set(index++, root1.getValue());
        storeInOrderRecursive(root1.getRightChild(), arr1, index);

        return index;
    }

    @Override
    public int[] getSortedTreeDesc() {
        return new int[0];
    }

    private Node findNode(int element) {
        Node node = rootNode;
        while (node != null) {
            if (element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
            } else if (element > node.getValue()) {
                node = node.getRightChild();
            }
        }
        return null;
    }

    public void addElementToTree() {
    }
}
