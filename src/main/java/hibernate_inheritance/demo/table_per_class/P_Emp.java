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
public class P_Emp extends Emp{

	
	@Column(name = "Salary")
	int salary;
	@Column(name = "Bonus")
	int bonus;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", bonus=" + bonus + "]";
	}
	
}
