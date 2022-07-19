public class MyThread extends Thread {
int threadID;
private static final int NUM_THREADS = 5 ;

MyThread (int ID) {
threadID = ID;
}

public void run () { // corpo de cada thread
 System.out.println (threadID + ": Hello World!") ;
 try {
Thread.sleep(5000);
 }
 catch (InterruptedException e) {
 e.printStackTrace();
 }
 System.out.println (threadID + ": Bye bye World!") ;
 }

public static void main (String args[]) {
 MyThread[] t = new MyThread[NUM_THREADS] ;

for (int i = 0; i < NUM_THREADS; i++) { // cria as threads
 t[i] = new MyThread (i);
 }
 for (int i = 0; i < NUM_THREADS; i++) { // inicia a execução das threads
 t[i].start () ;

 }
 }
 }
