package com.basics;

public class employee {
           String firstname;
           String lastname;
           double salary;
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}

           public static void main(String args[]){
        	  
        	   employee e1 =new employee();
        	   employee e2 =new employee();
        	   e1.setFirstname("tharu");
        	   e1.setLastname("sakthi");
        	   e1.setSalary(30000);
        	   e2.setFirstname("gowsi");
        	   e2.setLastname("sakthi");
        	   e2.setSalary(50000);
        	   System.out.println(e1.getSalary());
        	   System.out.println(e2.getSalary());
        	double Salary=e1.getSalary()*1.1;
        	
        	 System.out.println("increment salary="+Salary);
           }
           }
           
           

