package salary.bean_220930;

public class SalaryDTO implements Comparable <SalaryDTO> {
		// 필드 : 사원번호, 이름, 직급, 기본급, 수당, 세율, 월급
	private String name, position;
	private  int num, basepay, extrapay, tot, tax, salary;
	private double taxrate;
	
	public SalaryDTO( String name, String position, 
			int num, int basepay, int extrapay ) {
		this.num = num;
		this.basepay = basepay;
		this.extrapay = extrapay;
		this.tot = tot;
		this.salary = salary;
		this.name =name;
		this.position =position;
	
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getBasepay() {
		return basepay;
	}

	public void setBasepay(int basepay) {
		this.basepay = basepay;
	}

	public int getExtrapay() {
		return extrapay;
	}

	public void setExtrapay(int extrapay) {
		this.extrapay = extrapay;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getTaxrate() {
		return taxrate;
	}

	public void setTaxrate(double taxrate) {
		this.taxrate = taxrate;
	}
	public void calc() {
		tot = basepay + extrapay;
		taxrate = tot >4000000 ? 0.03 : tot > 2000000 ? 0.02 : 0.01;
		tax = (int)(tot * taxrate);
		salary = tot-tax;
	}
	@Override
	public String toString() {
		return num+"\t"
			  +name+"\t"
			  +position+"\t"
			  +basepay+"\t"
			  +extrapay+"\t"
			  +tax+"\t"
			  +salary;
	}
	
	@Override
	public int compareTo(SalaryDTO list) {
		int re = this.name.compareTo(list.name);
		return re;
	}

	

	

}
