//Write a Java program to create a producer-consumer scenario using the wait() and notify() methods for thread synchronization.

package com.thread.lab_9;

// Class to represent a shared resource between threads
class SharedResource {
    // Private variables to store the count and a flag to indicate if a value is set
    private int count = 0;
    private boolean valueSet = false;

    // Synchronized method to produce a value
    public synchronized void produce() throws InterruptedException {
        // Wait until the value is consumed (i.e., valueSet is false)
        while (valueSet) {
            wait();
        }

        // Produce a new value by incrementing the count
        count++;
        System.out.println("Produced: " + count);
        // Set the flag to indicate that a value is set
        valueSet = true;
        // Notify the consumer thread that a value is available
        notify();
    }

    // Synchronized method to consume a value
    public synchronized void consume() throws InterruptedException {
        // Wait until a value is produced (i.e., valueSet is true)
        while (!valueSet) {
            wait();
        }

        // Consume the value by printing it
        System.out.println("Consumed: " + count);
        // Reset the flag to indicate that no value is set
        valueSet = false;
        // Notify the producer thread that the value is consumed
        notify();
    }
}

// Class to represent a producer thread
class Producer implements Runnable {
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            // Call the produce method on the shared resource
            sharedResource.produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Class to represent a consumer thread
class Consumer implements Runnable {
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            // Call the consume method on the shared resource
            sharedResource.consume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        // Create a shared resource instance
        SharedResource sharedResource = new SharedResource();

        // Create producer and consumer threads
        Producer producer = new Producer(sharedResource);
        Consumer consumer = new Consumer(sharedResource);

        // Create threads for the producer and consumer
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        // Start the threads
        producerThread.start();
        consumerThread.start();
    }
}

/*Dry Run
 
Produced: 1
Consumed: 1

 
 */
