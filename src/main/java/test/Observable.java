package test;

public interface Observable {
    void 구독하기(Observer o);

    void 구독해지(Observer o);

    void 구독자들에게알리기();
}
