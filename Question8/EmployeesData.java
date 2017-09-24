public class EmployeesData{
  Director[] director;
  Manager[] manager;
  Respondent[] respondent;
  int directors= -1;
  int managers = -1;
  int respondents = -1;
  EmployeesData(int noOfDirector,int noOfManager,int noOfRespondent){
    director = new Director[noOfDirector];
    manager = new Manager[noOfManager];
    respondent = new Respondent[noOfRespondent];

  }
  public void addEmployee(Employee e){
    if(e.getType().equals("Respondent") && respondents < respondent.length){
      respondents++;
      respondent[respondents] = (Respondent) e;
    }
    if(e.getType().equals("Manager") && managers < manager.length){
      managers++;
      manager[managers] = (Manager)e;
    }
    if(e.getType().equals("Director") && directors < director.length){
      directors++;
      director[directors] =(Director) e;
    }
  }

  public Respondent[] getRespondents(){
    return respondent;
  }

  public int getRespondentsCount(){
    return respondents + 1;
  }

  public Manager[] getManagers(){
    return manager;
  }

  public int getManagersCount(){
    return managers + 1;
  }


  public Director[] getDirectors(){
    return director;
  }

  public int getDirectorsCount(){
    return directors + 1;
  }

}
