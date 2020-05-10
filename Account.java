package sukkiri;

public class Account {
	String account;
	int balance;

	public String toString(Object o) {
		return "\\" + this.balance + "(口座番号="
	+ account + ")";
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		} if (o instanceof Account) {
			Account a = (Account)o;
			String a1 = this.account.trim();
			String a2 = a.account.trim();
			return a1.equals(a2);
		} return false;
	}
}
