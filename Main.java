package com.bridgelabz.Queue;

public class Main {
    public static void main(String args[])
    {
        Queue q = new Queue();
        q.insertQueue(5);
        q.insertQueue(12);
        q.insertQueue(22);
        q.insertQueue(89);
        q.deleteQueue();
        q.show();
    }
}
