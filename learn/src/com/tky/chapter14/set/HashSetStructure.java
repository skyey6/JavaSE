package com.tky.chapter14.set;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/28 12:08
 */
public class HashSetStructure {
    public static void main(String[] args) {

        //模拟HashSet的底层（HashMap的底层结构）

        Node[] table = new Node[16];

        Node node1 = new Node("john", null);
        Node node2 = new Node("tom", null);

        table[2] = node1;
        //将node2挂到node1后面
        node1.next = node2;

    }
}

class Node {
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}