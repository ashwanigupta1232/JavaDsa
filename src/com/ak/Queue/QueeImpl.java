package com.ak.Queue;



class Que{
    int front, rear,size;
    int capcity;
    int[]ar;

    public void queueImpl(int capcity){
        this.capcity=capcity;
        front=this.size=0;
        rear = capcity-1;
        ar =  new int[this.capcity];

    }

}

public class QueeImpl {
    public static void main(String[] args) {

    }
}
