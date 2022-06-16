package hibernate_inheritance.demo.joined;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "ID")
public class RegularEmployee extends Employee{
	
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
