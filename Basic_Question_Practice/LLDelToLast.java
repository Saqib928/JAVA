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

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public int removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove from an empty list.");
            return -1; // Assuming -1 represents an error or an invalid value
        }

        int removedData;
        if (head.next == null) {
            removedData = head.data;
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            removedData = current.next.data;
            current.next = null;
        }

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

public class LLDelToLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            linkedList.addLast(scanner.nextInt());
        }

        System.out.println("Linked List:");
        linkedList.display();

        int removedElement = linkedList.removeLast();
        System.out.println("Removed element from the last: " + removedElement);

        System.out.println("Linked List after removal:");
        linkedList.display();
        scanner.close();
    }
}

