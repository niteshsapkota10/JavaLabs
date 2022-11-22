package threading;

import threading.MultiThreading;

public class MultiThreadingDemo {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            MultiThreading obj=new MultiThreading();
            obj.start();
        }
    }
}
