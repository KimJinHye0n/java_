

class Account {
	private String no; // 공개되면 안된다. : 개인정보니까
	private String name; // 공개되면 안된다.
	private int balance = 0; //공개되면 안된다.
	static double interest; // interest를 밑에서 쓰기 때문에 static을 넣어줘야한다.
	
	public Account(String num, String nm, int bal) {
		no = num;
		name = nm;
		balance = bal;
	}
	public int deposit(int amount) { // void를 쓰는 것이 좋다. 반환받는 값이 없기 때문 ->return쓰고 싶으면 해당 값을 쓰고 싶을 때 쓰면 된다.
		balance += amount; // this.을 쓰면 명확하게 볼 수 있다.
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
	//	balance = balance*(1+interest);  으로 끝내도 문제 없다.
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
	Account customer1=new Account("111-222-33333333","최은희",20000);
	Account customer2=new Account("555-666-77777777","남매월",100000);
	System.out.println("기본 적립금");
	System.out.println();
	printAccount(customer1);
	printAccount(customer2);
	System.out.println("한번의 입출금");
	customer1.deposit(1000000);
	customer2.withdraw(30000);
	System.out.println();
	printAccount(customer1);
	printAccount(customer2);
	System.out.println("이자율의 계산");
	System.out.println();
	Account.interest=0.05; //선언만 해주면 된다. 메소드 만들 필요 없다. static이기 때문에 한번 들어가면 세팅된다.
	customer1.addInterest(); //저축된 금액=원금+원금*이자율
	customer2.addInterest();//저축된 금액=원금+원금*이자율
	printAccount(customer1);
	printAccount(customer2);
	}
	static void printAccount(Account customer){
		System.out.println("계좌번호:"+customer.getAccountNo()); //나와야 하는 값이 있어야 하기 때문에 return해준 것.
		System.out.println("예금주이름:"+customer.getAccountName());
		System.out.println("잔액:"+customer.getBalance());
		System.out.println();
	}
}


class WorkShop2_1{
	
}