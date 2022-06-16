package hibernate_inheritance.demo.table_per_class;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverrides({
	@AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name"))  
})
public class C_Emp extends Emp{
	
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
