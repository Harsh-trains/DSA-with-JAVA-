package com.kunal;

public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            // Make it circular
            node.next = head; // Add this line
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                node = node.next; // Assignment should be unconditional
            } while (node != head);
        }
        System.out.println("HEAD");
    }

    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        CLL list1 = new CLL();
        System.out.println("Displaying empty list:");
        list1.display(); // Expected: HEAD

        CLL list2 = new CLL();
        list2.insert(10);
        System.out.println("Displaying list with one element:");
        list2.display(); // Expected: 10 -> HEAD

        CLL list3 = new CLL();
        list3.insert(10);
        list3.insert(20);
        list3.insert(30);
        System.out.println("Displaying list with multiple elements:");
        list3.display(); // Expected: 10 -> 20 -> 30 -> HEAD
    }
}
