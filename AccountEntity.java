package edu.com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT")
public class AccountEntity  {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      @Column(name = "ID")
      private Integer accountId;

      @OneToOne(mappedBy = "account")
     private EmployeeEntity employee;

	public AccountEntity() {
		super();
		
	}

	@Override
	public String toString() {
		return "AccountEntity [accountId=" + accountId + "]";
	}

	public AccountEntity(Integer accountId) {
		super();
		this.accountId = accountId;
	
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}
}
