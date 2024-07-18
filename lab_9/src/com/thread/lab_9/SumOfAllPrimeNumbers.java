//Write a Java program that calculates the sum of all prime numbers up to a given limit using multiple threads.

package com.thread.lab_9;

// Class that implements Runnable to find the sum of prime numbers in a given range
class PrimeNumber implements Runnable {
    private int start, end, primeSum = 0;

    // Constructor to initialize the start and end of the range
    public PrimeNumber(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        // Iterate over the range and check if each number is prime
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                // If the number is prime, add it to the prime sum
                primeSum = primeSum + i;
            }
        }
    }

    // Method to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        // Check if the number is divisible by any number up to its square root
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to get the sum of prime numbers found
    public int getPrimeSum() {
        return primeSum;
    }
}

public class SumOfAllPrimeNumbers {
    public static void main(String[] args) throws InterruptedException {
        // Set the limit for finding prime numbers
        int limit = 100;
        // Set the number of threads to use
        int numThreads = 4;
        // Calculate the segment size for each thread
        int segmentSize = limit / numThreads;

        // Create an array to hold the PrimeNumber objects
        PrimeNumber[] primeSumThreads = new PrimeNumber[numThreads];
        // Create an array to hold the threads
        Thread[] threads = new Thread[numThreads];

        // Initialize the start and end of the range for the first thread
        int start = 2;
        int end = segmentSize;

        // Create and start each thread
        for (int i = 0; i < numThreads; i++) {
            primeSumThreads[i] = new PrimeNumber(start, end);
            threads[i] = new Thread(primeSumThreads[i]);
            threads[i].start();

            // Update the start and end of the range for the next thread
            start = end + 1;
            end += segmentSize;
        }

        // Initialize the total prime sum
        int totalPrimeSum = 0;

        // Wait for each thread to finish and add its prime sum to the total
        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
            totalPrimeSum += primeSumThreads[i].getPrimeSum();
        }

        // Print the total sum of prime numbers
        System.out.println("The sum of prime numbers up to " + limit + " is: " + totalPrimeSum);
    }
    
}

/*Dry Run
 * 
 * The sum of prime numbers up to 100 is: 1060
 * 
 */
