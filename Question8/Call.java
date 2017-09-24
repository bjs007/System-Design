class Call{
  private int callId;
  private String customer;
  private String empId;
  private boolean attainded = false;
  Call(int callId){
    this.callId = callId;
  }
  public void setCustomerName(String customer){
    this.customer = customer;
  }
  public int getCallId(){
    return callId;
  }

  public void setEmployee(String empId){
    this.empId = empId;
    setAttainded();
  }

  public String etCustomerName(){
    return customer;
  }

  public void setAttainded(){
    attainded = true;
  }

}
