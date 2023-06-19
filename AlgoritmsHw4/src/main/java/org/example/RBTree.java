package org.example;

public class RBTree {


    private class Node {
        private int value;
        private Color color;
        private Node leftChild;
        private Node rightChild;
    }

    private enum Color {
        BLACK,
        RED
    }


}
