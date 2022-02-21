class Exercise20
{
	public static void main(String args[])
	{
		Person smith = new Person();
		smith.setName("Smith");
		smith.setAge(27);
		
		Account smithacc = new SavingsAccount();
		smithacc.setAccNum(11112);
		smithacc.setBalance(2000);
		smithacc.setAccHolder(smith);
		System.out.println("Smith account with initial balance 2000 is created successfully");

		Person kathy = new Person();
		kathy.setName("Kathy");
		kathy.setAge(26);
		
		Account kathyacc = new SavingsAccount();
		kathyacc.setAccNum(1145613);
		kathyacc.setBalance(3000);
		kathyacc.setAccHolder(kathy);
		System.out.println("Kathy account with initial balance 3000 is created successfully");

		smithacc.deposit(2000);
		kathyacc.withdraw(2000);
		System.out.println("Smith Acc Balance :"+smithacc.getBalance());
		System.out.println("Kathy Acc Balance :"+kathyacc.getBalance());
	}
}

class Person
{
	String name;
	float age;

	public void setName(String n)
	{
		name = n;
	}

	public String getName()
	{
		return name;
	}

	public void setAge(float a)
	{
		age = a;
	}

	public float getAge()
	{
		return age;
	}
}

class Account
{
	long accNum;
	double balance;
	Person accHolder;
	
	public void setAccNum(long accNo)
	{
		accNum = accNo;
	}

	public long getAccNum()
	{
		return accNum;
	}

	public void setBalance(double bal)
	{
		balance = bal;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setAccHolder(Person per)
	{
		accHolder = per;
	}

	public Person getAccHolder()
	{
		return accHolder;
	}

	void deposit(double amt)
	{
		balance = balance + amt;
		System.out.println("Money Deposited");
	}
	
	void withdraw(double amt)
	{
		balance = balance - amt;
		System.out.println("Money Withdrawed");		
	}
}

class SavingsAccount extends Account
{
	final long minBalance = 500;
	
	//@Override
	void withdraw(double amt)
	{
		if((balance - amt) > minBalance)
		{
			balance = balance - amt;
		}
		else
		{
			System.out.println("withdraw request rejected!");
		}	
	}
}

class CurrentAccount extends Account
{
	long overdraftLimit = 50000;

	//@Override
	void withdraw(double amt)
	{
		if(amt < overdraftLimit)
		{
			balance = balance - amt;
		}
		else
		{
			System.out.println("withdraw request rejected!");
		}	
	}
}









