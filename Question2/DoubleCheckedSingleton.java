class DoubleCheckedSingleton{
  private volatile static DoubleCheckedSingleton doubleCheckedSingleton = null;
  private DoubleCheckedSingleton(){}
  public static DoubleCheckedSingleton getInstance(){
    if(doubleCheckedSingleton == null){
      synchronized (DoubleCheckedSingleton.class){
        if(doubleCheckedSingleton == null)
          doubleCheckedSingleton = new DoubleCheckedSingleton();
      }

    }
    return doubleCheckedSingleton;
  }
}

/*
If you notice carefully once an object is created synchronization is no longer useful because now obj will not be null and any sequence of operations will lead to consistent results.
So we will only acquire lock on the getInstance() once, when the obj is null. This way we only synchronize the first way through, just what we want.

We have declared the obj volatile which ensures that multiple threads offer the obj variable correctly when it is being initialized to Singleton instance. This method drastically reduces the overhead of calling the synchronized method every time.

*/
