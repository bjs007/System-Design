public class SynchronizedSingleton{
  private static SynchronizedSingleton classicSingleton = null;
  private SynchronizedSingleton(){}
  public static synchronized SynchronizedSingleton getInstance(){
    if(classicSingleton == null)
       classicSingleton = new SynchronizedSingleton();
       return classicSingleton;
  }
}

/*

Here using synchronized makes sure that only one thread at a time can execute getInstance().
The main disadvantage of this is method is that using synchronized every time while creating the singleton object is expensive and may decrease the performance of your program. However if performance of getInstance() is not critical for your application this method provides a clean and simple solution.

*/
