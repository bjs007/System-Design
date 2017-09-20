class DBConnectionPool{
  public static void main(String[] args){

    ConnectionPool connPool = ConnectionPool.getConnectionPool();

    for(int i=0 ; i<4;i++){
      connPool.getConnection();
    }

    // for(int i=0;i <10;i++){
    //   connPool.removeConnection();
    // }

  }
}
