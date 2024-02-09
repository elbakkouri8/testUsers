package org.example;

public class Main extends Thread{


    public void run(){
        int i;
        for(i=0;i<5;i++){
            System.out.println(i);
        }

    }
    public static void main(String[] args) throws InterruptedException {
        Main task =new Main();
        task.start();
        Main task2 =new Main();
        task2.start();
        try {
            task.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("task 1 termine");
    }
}
