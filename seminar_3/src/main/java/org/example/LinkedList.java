package org.example;

import java.util.Comparator;

public class LinkedList<T> {

    public Node head;

    public Node tail;

    public class Node{

        public T value;
        public Node next;
        public Node prev;
    }

    public void addFirst(T value){
        Node node = new Node();
        node.value = value;
        if (head != null){
            node.next = head;
        }
        head = node;
    }

    public void removeFirst(){
        if (head != null){
            head = head.next;
        }
    }

    public Node contains(T value){
        Node node = head;
        while (node != null){
            if(node.value.equals(value)){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void directSort(Comparator<T> comparator){
        Node node = head;
        while (node != null){
            Node minValueNode = node;

            Node node2 = node.next;
            while (node2 != null){
                if (comparator.compare(minValueNode.value, node2.value) > 0){
                    minValueNode = node2;
                }
                node2 = node2.next;
            }

            if (minValueNode != node){
                T buff = node.value;
                node.value = minValueNode.value;
                minValueNode.value = buff;
            }

            node = node.next;
        }
    }

    public LinkedList<T> reverse(LinkedList<T> linkedList){
        LinkedList<T> reverseList = new LinkedList<>();
        Node node = linkedList.head;
        while (node != null){
            reverseList.addFirst(node.value);
            node = node.next;
        }
        return reverseList;

    }

    public void reverseV2(LinkedList<T> linkedList){
        Node node = linkedList.head;
        while (node != null){
            node = node.next;
        }

    }

}
