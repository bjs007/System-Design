public class Notification{
  private String id;
  private String message;

  Notification(String id,String message){
    this.id = id;
    this.message = message;
  }

  public String getId(){
    return id;
  }

  public String getMessage(){
    return message;
  }
}
