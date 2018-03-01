Threads, unlike heavyweight process, are lightweight and run inside a single process – they share the same address space, the resources allocated and the environment of that process. It is lightweight because it runs within the context of a heavyweight process and takes advantage of the resources allocated for that program and the program’s environment.

There are two ways of create a new thread.
1. Extend a subclass from the superclass Thread and override the run() method to specify the running behavior of the thread. Create an instance and invoke the start() method, which will call-back the run() on a new thread.
2. Create a class that implements the Runnable interface and provide the implementation to the abstract method run() to specify the running behavior of the thread. Construct a new Thread instance using the constructor with a Runnable object and invoke the start() method, which will call back run() on a new thread.

The life cycle of a thread
Once a new thread is constructed, it's in the "new" state. Frome the "new" state, the only thing you can do is to invoke the start() method, which puts this thread into a runnable state. However, the truth is that thread may be running or waiting for its turn of the CPU time. Once sleep() or wait() are called, thread enters into blocked state. Its notify() method will inform waiting thread to be back to running state. A thread is in a "terminated" state, only when the run() method terminates naturally and exits.

Thread Scheduling and Priority
JVM implements a fixed priority thread-scheduling scheme. Each thread is assigned a priority number (between the Thread.MIN_PRIORITY and Thread.MAX_PRIORITY). The higher the number, the higher is the priority for the thread. When a new thread is created, it inherits the priority number from the thread that created it. 

Monitor Lock & Synchronization
Each Java object has a lock. At any time, the lock is controlled by, at most, a single thread. You could mark a method or a block of the codes with keyword synchronized. A thread that wants to execute an object's synchronized code must first attempt to acquire its lock. If the lock is under the control of another thread, then the attempting thread goes into the Seeking Lock state and becomes ready only when the lock becomes available. When a thread that owns a lock completes the synchronized code, it gives up the lock.

Starvation & Deadlock
Starvation is the state where one (or more) thread is deprived of a chance to access an object. The problem can be resolved by setting the correct priorities to all the threads.

Deadlock refers to the situation where a thread is waiting for a condition, but somewhere else in the program prevented the condition from being fulfilled, thus, prevented the thread from executing. A classical example, known as "deadly embrace" is as follow: thread 1 is holding the lock to object A and thread 2 is holding the lock to object B. Thread 1 is waiting to acquire the lock to object B and thread 2 is waiting to acquire the lock to object A. Both threads are in deadlock and cannot proceed. Keep transactions short and in one batch, access objects in the same order.

Thread Pool
A thread pool is a managed collection of threads that are available to execute tasks. When a large number of tasks is executed using a thread pool, the performance improves as the threads are re-cycled to execute the tasks, which reduces the per-task invocation overhead.
To use a thread pool, you can use an implementation of the interface ExecutorService, such as ThreadPoolExecutor or ScheduledThreadPoolExecutor. However, more convenient factory methods are provided in the Executors class as follows:
Executors.newSingleThreadExecutor(): creates a single background thread.
Executors.newFixedThreadPool(int numThreads): creates a fixed size thread pool.
Executors.newCachedThreadPool(): create a unbounded thread pool, with automatic thread reclamation.
The steps of using thread pool are:
Write you worker thread class which implements Runnable interface. The run() method specifies the behavior of the running thread.
Create a thread pool (ExecutorService) using one the factory methods provided by the Executors class. The thread pool could have a single thread, a fixed number of threads, or an unbounded number of threads.
Create instances of your worker thread class. Use execute(Runnable r) method of the thread pool to add a Runnable task into the thread pool. The task will be scheduled and executes if there is an available thread in the pool.