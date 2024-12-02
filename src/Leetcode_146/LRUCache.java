package Leetcode_146;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
class Node {

    int key;
    int value;

    Node next;
    Node prev;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class LRUCache {

    Node head;
    Node tail;
    int capacity;
    Map<Integer, Node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            append(node);
            return node.value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            node.value = value;
            append(node);
        } else {
            if (map.size() == capacity) {
                remove(tail);
            } else {
                Node node = new Node(key, value);
                map.put(key, node);
                append(node);
            }
        }
    }

    private void remove(Node node) {
        map.remove(node.key);

        if (node.next != null) {
            node.next.prev = node.prev;
        }

        if (node.prev != null) {
            node.prev.next = node.next;
        }

        if (node == head) {
            head = node.next;
        }

        if (node == tail) {
            tail = node.prev;
        }

        node.prev = null;
        node.next = null;

    }

    private void append(Node node) {
        map.put(node.key, node);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

}