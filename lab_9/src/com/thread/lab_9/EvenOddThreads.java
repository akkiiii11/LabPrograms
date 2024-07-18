//Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.

package com.thread.lab_9;

// Class that implements Runnable to print even numbers
class EvenThread implements Runnable {

    @Override
    public void run() {
        // Iterate from 1 to 20 and print even numbers
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

// Class that implements Runnable to print odd numbers
class OddThread implements Runnable {

    @Override
    public void run() {
        // Iterate from 1 to 20 and print odd numbers
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}

public class EvenOddThreads {

    public static void main(String[] args) {
        // Create an instance of EvenThread
        EvenThread even1 = new EvenThread();
        // Create a thread and pass the EvenThread instance to it
        Thread t1 = new Thread(even1);
        // Start the thread
        t1.start();

        // Create an instance of OddThread
        OddThread odd1 = new OddThread();
        // Create a thread and pass the OddThread instance to it
        Thread t2 = new Thread(odd1);
        // Start the thread
        t2.start();
    }
}

/*Dry Run
 * 
Odd: 1
Odd: 3
Odd: 5
Odd: 7
Odd: 9
Odd: 11
Odd: 13
Odd: 15
Odd: 17
Even: 2
Odd: 19
Even: 4
Even: 6
Even: 8
Even: 10
Even: 12
Even: 14
Even: 16
Even: 18
Even: 20

 * 
 */
