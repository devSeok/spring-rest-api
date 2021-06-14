package test;

import test.Ober;

public class ObserverMain {
    public static void main(String[] args) {
        Book book = new Book();
        Observer p1 = new p1();
        Observer p2 = new p2();

        book.구독하기(p1);
        book.구독하기(p2);

        book.신규컨텐츠나왔다();

        book.구독해지(p2);

        book.신규컨텐츠나왔다();
    }
}
