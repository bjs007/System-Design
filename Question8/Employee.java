abstract class Employee{
  protected String name;
  protected String id;
  public  String type;
  protected boolean isAvailable = true;
  Employee(String name,String id,String type){
    this.name = name;
    this.id = id;
    this.type = type;
  }

  protected abstract void doWork();
  public boolean isAvailable(){
    return isAvailable;
  }
  public void attaindCall(Call call){
    call.setEmployee(id);
    this.setNotAvailable();
  }
  public void setAvailable(){
    isAvailable = true;
  }
 public String getType(){
   return type;
 }
  public void setNotAvailable(){
    isAvailable = false;
  }

public String getId(){
  return id;
}
public String getName(){
  return name;
}
}
