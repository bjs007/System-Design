import java.util.*;
import java.sql.*;
public class ConnectionPool{
  private static ConnectionPool connectionPool = null;
  private static PriorityQueue<ConnectionObj> pool = null;
  int max_connection = 10;
  private ConnectionPool(){
    pool = new PriorityQueue<ConnectionObj>(new ConnectionObjComparator());
  }

  public static ConnectionPool getConnectionPool(){
    if(connectionPool == null){
      synchronized (ConnectionPool.class){
        if(connectionPool == null){
          connectionPool = new ConnectionPool();
        }
      }
    }
    return connectionPool;
  }

  public Connection getConnection(){
    ConnectionObj connObj;
    Connection connection = null;
    if(pool.size() < max_connection){
      connObj = new ConnectionObj();
       System.out.println("Connection Object created");
    }
    else{
       connObj = pool.poll();
       System.out.println("Earlider Connection Object used");
     }

    connection = connObj.getConnection();
    System.out.println("Load: "+connObj.getLoad());
    pool.add(connObj);
    return connection;
  }

public boolean removeConnection(Connection conn){
    Iterator<ConnectionObj> it = pool.iterator();
    while(it.hasNext()){
      ConnectionObj obj = it.next();
      if(obj.getConnectionObj().equals(conn)){
        obj.decreaseLoad();
        it.remove();
        if(obj.getLoad() == 0){
          obj.setConnectionNull();
          System.out.println("Connection Object destroyed");
        }else{
          System.out.println("Connection Object load decreased");
          pool.add(obj);
        }
        return true;
      }
    }

    return false;
}

}
