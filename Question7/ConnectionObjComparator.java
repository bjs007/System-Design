import java.util.Comparator;

public class ConnectionObjComparator implements Comparator<ConnectionObj>{
  public int compare(ConnectionObj o1,ConnectionObj o2){
    return o1.getLoad() - o2.getLoad();
  }
}
