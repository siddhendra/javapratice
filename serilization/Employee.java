

public class Employee implements Comparable<Employee> {
    int eno;
    String ename;
    
   public int getEno() {
      return eno;
   }

   public void setEno(int eno) {
      this.eno = eno;
   }

   public String getEname() {
      return ename;
   }

   public void setEname(String ename) {
      this.ename = ename;
   }
   

   public Employee(int eno, String ename) {
      this.eno = eno;
      this.ename = ename;
   }

   @Override
   public int compareTo(Employee emp) {
      return emp.getEname().compareTo(this.ename);
   }
public String toString()
{
   return eno+"-"+ename;
}
  
    
 }
   
  
    
    

    



