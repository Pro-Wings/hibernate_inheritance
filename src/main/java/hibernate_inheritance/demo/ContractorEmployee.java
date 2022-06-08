package hibernate_inheritance.demo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Ctr_emp")
public class ContractorEmployee extends Employee {
	
	@Column(name = "per_hr_pay")
	int pay_per_hour;
	@Column(name = "duration")
	String contractDuration;
	public int getPay_per_hour() {
		return pay_per_hour;
	}
	public void setPay_per_hour(int pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}
	public String getContractDuration() {
		return contractDuration;
	}
	public void setContractDuration(String contractDuration) {
		this.contractDuration = contractDuration;
	}
	@Override
	public String toString() {
		return "ContractorEmployee [pay_per_hour=" + pay_per_hour + ", contractDuration=" + contractDuration + "]";
	}
	
	
	
}
