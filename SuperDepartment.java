package com.greatlearning.oops;

	public class SuperDepartment {
		
		public String departmentName() {
			return "Super Department";
		}
		
		public String getTodaysWork() {
				return "No Work as of now";
		}
		
		public String getWorkDeadline() {
			return "Nil";
		}
		
		public String isTodayAHoliday() {
			return "Today is not a Holiday";
		}
		
	}

	class Admin extends SuperDepartment {
	
		public String departmentName() {
			return "Admin Department";
		}
		
		public String getTodaysWork() {
				return "Complete Your Document Submission";
		}
		
		public String getWorkDeadline() {
			return "Complete by EOD";


		}
		

	static class HrDept extends SuperDepartment {
			
			public String departmentName() {
				return "HR Department";
			}
			
			public String getTodaysWork() {
					return "Fill Today's Workdsheet and mark your attendance";
			}
			
			public String getWorkDeadline() {
				return "Complete by EOD";
			}
			
			public String doActivity() {
				return "team Lunch";
			}
		
	}
	
	
	static class TechDept extends SuperDepartment {
		
		public String departmentName() {
			return "Tech Department";
		}
		
		public String getTodaysWork() {
				return "Complete Coding of Module 1";
		}
		
		public String getWorkDeadline() {
			return "Complete by EOD";
		}
		
		public String getTechStackInformation() {
			return "Core Java";
		}
	
}
	
	public static void main(String[] args) {

			    // Create Depatment objects
			
			Admin myAdmin = new Admin();
		
			HrDept myHr = new HrDept();

			TechDept myTech = new TechDept();
		
		// Call and Display values
			    
			SuperDepartment sup = new SuperDepartment();
			
			System.out.println("Welcome to " + myAdmin.departmentName());
		    System.out.println(myAdmin.getTodaysWork());
		    System.out.println(myAdmin.getWorkDeadline());
		    System.out.println(sup.isTodayAHoliday());
			
		    System.out.println();
		    
			    System.out.println("Welcome to " + myHr.departmentName());
			    System.out.println(myHr.doActivity());
			    System.out.println(myHr.getTodaysWork());
			    System.out.println(myHr.getWorkDeadline());
			    System.out.println(sup.isTodayAHoliday());
			    			
			System.out.println();
			    
				    System.out.println("Welcome to " + myTech.departmentName());
				    System.out.println(myTech.getTodaysWork());
				    System.out.println(myTech.getWorkDeadline());
				    System.out.println(myTech.getTechStackInformation());
				    System.out.println(sup.isTodayAHoliday());
			    
			}
		
}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	