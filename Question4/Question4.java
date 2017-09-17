class Question4{
  public static void main(String args[]){
    NotificationCollection nc = new NotificationCollection(10);
    nc.addNotification(new Notification("1","Design Pattern"));
    nc.addNotification(new Notification("2","Iterator Design Pattern"));
    NotificationBar nb = new NotificationBar(nc);
    nb.printNotifications();
  }
}
