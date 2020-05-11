package may0511;

class Business implements Cloneable {
	private String company;
	private String work;
	public Business(String company, String work) {
		this.company = company;
		this.work = work;
	}
	public void showBusinessInfo() {
		System.out.println("회사 : " + company);
		System.out.println("업무 : " + work);
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		Business b = (Business)super.clone();
		b.company = new String(company);
		b.work = new String(work);
		return b;
	}
}
class PersonalInfo implements Cloneable {
	private String name;
	private int age;
	private Business bz;
	public PersonalInfo(String name, int age, String company, String work) {
		this.name = name;
		this.age = age;
		bz = new Business(company, work);
	}
	public void showPersonalInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		bz.showBusinessInfo();
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		PersonalInfo p = (PersonalInfo)super.clone();
		p.name = new String(name);
		return p;
	}
}

public class S19_2 {
	public static void main(String[] args) {
		PersonalInfo p1 = new PersonalInfo("이름",19, "회사", "일" );
		PersonalInfo p2;
	}
}
