package com.tky.chapter14.list;

import java.util.LinkedList;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/27 18:12
 */
public class LinkedListCRUD {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        /*
           public LinkedList() {
           }

           这时 linkeList 的属性 first=null，last=null
         */
        LinkedList linkedList = new LinkedList();

        /* 源码：
            public boolean add(E e) {
                linkLast(e);
                return true;
            }

            void linkLast(E e) {
                final Node<E> l = last;
                final Node<E> newNode = new Node<>(l, e, null);
                last = newNode;
                if (l == null)
                    first = newNode;
                else
                    l.next = newNode;
                size++;
                modCount++;
            }
         */
        linkedList.add(1);
        linkedList.add(10);
        linkedList.add(123);
        System.out.println("linkedList = " + linkedList);

        //删除结点
        /*
            private E unlinkFirst(Node<E> f) {
                final E element = f.item;
                final Node<E> next = f.next;
                f.item = null;
                f.next = null; // help GC
                first = next;
                if (next == null)
                    last = null;
                else
                    next.prev = null;
                size--;
                modCount++;
                return element;
            }
         */
        linkedList.remove(); //默认删除第一个结点
        System.out.println("linkedList = " + linkedList);

        //修改某个结点对象
        linkedList.set(1, 999);
        System.out.println("linkedList = " + linkedList);

        //得到某个结点对象
        System.out.println(linkedList.get(1));

    }
}
