import java.util.*;
public class CallDispatcher{
  EmployeesData emps;
  Queue<Call> calls;
  CallDispatcher(){
    calls = new LinkedList<Call>();
  }

  void setEmployees(EmployeesData emps){
    this.emps = emps;
  }

  synchronized void addCall(Call call){
  calls.add(call);
  }


  void CallDispatcher(Call call){
  //
   Employee  e = getAvailableEmployee();
   if(e == null){
     System.out.println("No employee available to attain call. Please be on hold or call later");
     calls.add(call);
     return;
   }
   call.setAttainded();
   call.setEmployee(e.getId());
   System.out.println("Call id " +call.getCallId() + "attainded by " + e.getName());

   }


  Employee getAvailableEmployee(){
  int index = 0;
   Employee employees [] = emps.getRespondents();

   for(int i=0;i <emps.getRespondentsCount();i++){
     if(employees[i].isAvailable()){
       return employees[i];
     }
   }
   employees = emps.getRespondents();

   for(int i=0;i <emps.getManagersCount();i++){
     if(employees[i].isAvailable()){
       return employees[i];
     }
   }

   employees = emps.getDirectors();


   for(int i=0;i <emps.getDirectorsCount();i++){
     if(employees[i].isAvailable()){
       return employees[i];
     }
   }

  return null;
  }

}
