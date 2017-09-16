class EagerSingleton{
  private static EagerSingleton eagerSingleton = new EagerSingleton();
  private EagerSingleton(){}
  public static EagerSingleton getInstance(){
    return eagerSingleton;
  }
}
/*
Here we have created instance of singleton in static initializer. JVM executes static initializer when the class is loaded and
hence this is guaranteed to be thread safe. Use this method only when your singleton class is light and is used throughout the
execution of your program.
*/
