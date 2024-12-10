package JUC.Confluent;

import java.util.HashMap;
import java.util.Map;

class Node {
    Node next;
    Node prev;
    String tokenID;
    int timeStamp;

    public Node(String tokenID, int timeStamp) {
        this.tokenID = tokenID;
        this.timeStamp = timeStamp;
    }
}


public class TimeToken {
    int ttl;
    Map<String, Node> tokenMap;
    Node head;
    Node tail;

    public TimeToken(int ttl) {
        this.ttl = ttl;
        tokenMap = new HashMap<String, Node>();
    }

    public void generate(String tokenID, int timeStamp) {
        Node node = new Node(tokenID, timeStamp);
        tokenMap.put(tokenID, node);
        append(node);
    }

    public void renew(String tokenID, int timeStamp) {
        // TokenMap operations
        if (tokenMap.containsKey(tokenID)) {
            tokenMap.get(tokenID).timeStamp = timeStamp;
            remove(tokenMap.get(tokenID));
            append(tokenMap.get(tokenID));
            update(timeStamp);
        } else {
            Node newNode = new Node(tokenID, timeStamp);
            tokenMap.put(tokenID, newNode);
            append(newNode);
            update(timeStamp);
        }
    }

    public int count(int timeStamp) {
        update(timeStamp);
        return tokenMap.size();
    }

    private void update(int timeStamp) {
        while (tail != null && tail.timeStamp < timeStamp - ttl) {
            remove(tail);
            tokenMap.remove(tail.tokenID);
        }

    }

    private void remove(Node node) {
        if (node.next != null) {
            node.next.prev = node.prev;
        }
        if (node.prev != null) {
            node.prev.next = node.next;
        }
        if (node == head) {
            head = head.next;
        }
        if (node == tail) {
            tail = tail.prev;
        }
        node.prev = null;
        node.next = null;
    }

    private void append(Node node) {
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
