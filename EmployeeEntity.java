package edu.com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
	@Table(name = "EMPLOYEE")
	public class EmployeeEntity { 

	      @Id
	      @GeneratedValue(strategy = GenerationType.IDENTITY)
	      @Column(name = "ID")
	      private Integer employeeId;

		   private String employeeName;
		   private String employeeEmail;

	      @OneToOne
	     @JoinColumn(name="ACCOUNT_ID")
	      private AccountEntity account;
	      
	      
	      public EmployeeEntity() {
	  		super();
	  		
	  	}

	     
	      
	      
		public EmployeeEntity(Integer employeeId, String employeeName, String employeeEmail) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.employeeEmail = employeeEmail;
		}




		public Integer getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(Integer employeeId) {
			this.employeeId = employeeId;
		}

		public AccountEntity getAccount() {
			return account;
		}

		public void setAccount(AccountEntity account) {
			this.account = account;
		}




		public String getEmployeeName() {
			return employeeName;
		}




		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}




		public String getEmployeeEmail() {
			return employeeEmail;
		}




		public void setEmployeeEmail(String employeeEmail) {
			this.employeeEmail = employeeEmail;
		}




		@Override
		public String toString() {
			return "EmployeeEntity [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeEmail="
					+ employeeEmail + "]";
		}

}
