public class NotificationIterator implements Iterator{

Notification notifications[];
int pos = 0;
int size;

NotificationIterator(Notification[] notifications,int size){
  this.notifications = notifications;
  this.size = size;
}

public boolean hasNext(){
  if(pos>=notifications.length||notifications[pos]==null)
  return false;
  return true;
}
public Object next(){
  if(!hasNext()){
    return null;
  }
  Notification n = notifications[pos];
  pos++;
  return n;
}
}
