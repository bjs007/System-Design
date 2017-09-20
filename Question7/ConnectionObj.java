import java.sql.*;
public class ConnectionObj{
private int load = 0;
private Connection conn = null;
ConnectionObj(){
  conn = createConnection();
}

public Connection createConnection(){

    	try{
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/easytrip","root","root");
		}catch(Exception e){
			e.printStackTrace();
		}
    increaseLoad();
   return conn;
	}
public Connection getConnection(){
  increaseLoad();
  return conn;
}
public void setConnectionNull(){
  conn = null;
}
public Connection getConnectionObj(){
  return conn;
}
public void increaseLoad(){
  load++;
}

public void decreaseLoad(){
  load --;
}

public int getLoad(){
  return load;
}

}
