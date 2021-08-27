package com.tky.chapter14.list;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/27 17:11
 */
public class LinkedList01 {
    public static void main(String[] args) {

        //模拟一个简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node tky = new Node("tky");

        //连接这些结点，形成双向链表
        jack.next = tom;
        tom.pre = jack;
        tom.next = tky;
        tky.pre = tom;

        Node first = jack; //头结点
        Node last = tky;   //尾结点

        //遍历链表
        while (first != null) {
            System.out.println(first);
            first = first.next;
        }
    }
}

class Node {
    public Object item; //真正存放数据
    public Node next; //指向后一个结点
    public Node pre; //指向前一个结点

    public Node(Object name) {
        this.item = name;
    }

    public String toString() {
        return "Node name = " + item.toString();
    }
}