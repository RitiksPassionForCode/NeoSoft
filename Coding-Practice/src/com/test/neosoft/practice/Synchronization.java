package com.test.neosoft.practice;

public class Synchronization {

//	//the lock is applied by the method
//	synchronized void getSumOfArray(int[] numbers) {
//		int sum = 0;
//
//		for (int number : numbers) {
//			System.out.println(Thread.currentThread().getName() + " adds " + sum + " to " + number + " to get -> "
//					+ (sum += number));
//
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				throw new RuntimeException(e);
//			}
//		}
//	}
	
//	//synchronized block locks are accessed on the object
//	void getSumOfArray(int[] numbers) {
//        synchronized (this){
//            int sum = 0;
//
//            for (int number : numbers) {
//                System.out.println(Thread.currentThread()
//                        .getName()
//                        + " adds "
//                        + sum + " to "
//                        + number + " to get -> "
//                        + (sum += number));
//
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//    }

	
	// if there is more than one object, two threads may acquire the locks and enter a synchronized block 
	//or block, with a separate lock for each object. To avoid this, static synchronization can be used.
	 synchronized static void getSumOfArray(int[] numbers) {
         int sum = 0;

         for (int number : numbers) {
             System.out.println(Thread.currentThread()
                     .getName()
                     + " adds "
                     + sum + " to "
                     + number + " to get -> "
                     + (sum += number));

             try {
                 Thread.sleep(500);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
	 }
	
	public static void main(String[] args) {
		Synchronization service = new Synchronization();
		Synchronization service1 = new Synchronization();

		Thread threadOne = new Thread(() -> service.getSumOfArray(new int[] { 10, 11, 12 }));
		Thread threadTwo = new Thread(() -> service.getSumOfArray(new int[] { 20, 21, 22 }));
		Thread threadThree = new Thread(() -> service1.getSumOfArray(new int[] { 10, 11, 12 }));
		Thread threadFour = new Thread(() -> service1.getSumOfArray(new int[] { 20, 21, 22 }));

		threadOne.start();
		threadTwo.start();
		threadThree.start();
		threadFour.start();
	}
}
