package packageauto;

public class Category {

	
			private String catName;
			private Employee emp1;
			
			
	
			public String getCatName() {
				return catName;
			}
			public void setCatName(String catName) {
				this.catName = catName;
			}
			public Employee getEmp1() {
				return emp1;
			}
			public void setEmp1(Employee emp1) {
				this.emp1 = emp1;
			}
			
			void Display()
			{
				System.out.println("category Name:-"+catName);
				System.out.println("employee Id:-" +emp1.getEmpId()+"employee name:-" +emp1.getEmpName());
			}
				
	
}
