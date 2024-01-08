package Basic_Question_Practice;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public int removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove from an empty list.");
            return -1; // Assuming -1 represents an error or an invalid value
        }

        int removedData = head.data;
        head = head.next;
        return removedData;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public boolean isEmpty() {
        return head == null;
    }
}

public class LLDelToStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            linkedList.addFirst(scanner.nextInt());
        }

        System.out.println("Linked List:");
        linkedList.display();

        int removedElement = linkedList.removeFirst();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Linked List after removal:");
        linkedList.display();
        scanner.close();
    }
}
