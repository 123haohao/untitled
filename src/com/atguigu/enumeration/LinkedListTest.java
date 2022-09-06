package com.atguigu.enumeration;

public class LinkedListTest<E> {
    private  E item;
    LinkedListTest next;
    LinkedListTest prev;



    public static void main(String[] args) {
        LinkedListTest list1 = new LinkedListTest();
        list1.item = "aa";
        LinkedListTest list2 = new LinkedListTest();
        list2.item = "bb";
        LinkedListTest list3 = new LinkedListTest();
        list3.item = "cc";

        list2.next = list3;
        list1.next = list2;

        list3.prev = list2;
        list2.prev = list1;

        System.out.println(list1);
    }


}
