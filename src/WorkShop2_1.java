

class Account {
	private String no; // �����Ǹ� �ȵȴ�. : ���������ϱ�
	private String name; // �����Ǹ� �ȵȴ�.
	private int balance = 0; //�����Ǹ� �ȵȴ�.
	static double interest; // interest�� �ؿ��� ���� ������ static�� �־�����Ѵ�.
	
	public Account(String num, String nm, int bal) {
		no = num;
		name = nm;
		balance = bal;
	}
	public int deposit(int amount) { // void�� ���� ���� ����. ��ȯ�޴� ���� ���� ���� ->return���� ������ �ش� ���� ���� ���� �� ���� �ȴ�.
		balance += amount; // this.�� ���� ��Ȯ�ϰ� �� �� �ִ�.
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}

	public int addInterest() {
		balance = balance* (int)(1+interest);
		return balance;
	}
	
	//public void addInterest() {
	//	balance = balance*(1+interest);  ���� ������ ���� ����.
	//} 
	
	public String getAccountNo() {
		return no;
	}
	public String getAccountName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
}
class AccountTest{
	public static void main(String[] args){
	Account customer1=new Account("111-222-33333333","������",20000);
	Account customer2=new Account("555-666-77777777","���ſ�",100000);
	System.out.println("�⺻ ������");
	System.out.println();
	printAccount(customer1);
	printAccount(customer2);
	System.out.println("�ѹ��� �����");
	customer1.deposit(1000000);
	customer2.withdraw(30000);
	System.out.println();
	printAccount(customer1);
	printAccount(customer2);
	System.out.println("�������� ���");
	System.out.println();
	Account.interest=0.05; //���� ���ָ� �ȴ�. �޼ҵ� ���� �ʿ� ����. static�̱� ������ �ѹ� ���� ���õȴ�.
	customer1.addInterest(); //����� �ݾ�=����+����*������
	customer2.addInterest();//����� �ݾ�=����+����*������
	printAccount(customer1);
	printAccount(customer2);
	}
	static void printAccount(Account customer){
		System.out.println("���¹�ȣ:"+customer.getAccountNo()); //���;� �ϴ� ���� �־�� �ϱ� ������ return���� ��.
		System.out.println("�������̸�:"+customer.getAccountName());
		System.out.println("�ܾ�:"+customer.getBalance());
		System.out.println();
	}
}


class WorkShop2_1{
	
}