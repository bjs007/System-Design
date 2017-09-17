public class NotificationCollection implements Collection {
  Notification notifications[];
  int max_size;
  int index = 0;

  NotificationCollection(int max_size){
    this.max_size = max_size;
    notifications = new Notification[max_size];
  }

  public void addNotification(Notification notification){
    if(index == max_size){
      System.out.println("Notification box is full!");
      return;
    }
    notifications[index] = notification;
    index++;
  }

  public boolean removeNotification(int index){
    if(notifications == null || notifications.length == 0|| index >= notifications.length||index <0)
    return false;
    notifications[index] = null;
    int i = index;
    while(i + 1< notifications.length && notifications[i+1] !=null){
      notifications[i] = notifications[i+1];
      i++;
    }
    notifications[i] = null;
    index--;
    return true;
  }
 public Iterator createIterator(){
   return new NotificationIterator(notifications,index);
 }
}
