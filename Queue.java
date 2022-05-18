package com.bridgelabz.Queue;
public class Queue {
    int queue[] = new int[5];
    int size;
    int front;
    int rear;

    public void insertQueue(int data)
    {
        queue[rear] = data;
        rear = rear + 1;
        size = size +1 ;
    }
    public int deleteQueue()
    {
        int data;
        data = queue[front];
        front = front + 1;
        size = size - 1;
        return data;
    }
    public void  show()
    {
        for(int i=0; i<=size ;i++)
        {
            System.out.println(queue[front +i]);
        }
    }

}
