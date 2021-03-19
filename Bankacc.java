// Banking Management Project
import java.util.Scanner;
class Project
{
	Scanner sc=new Scanner(System.in);
	public int m=0,d,c,flag=0;
	public int count=0;
	public void Checkbalance()
	{
		System.out.println("Account balance: "+m+"/-");
		System.out.println("=============================");
	}

	public void Deposit()
	{
		System.out.print("Deposit Amount: ");
		m=sc.nextInt();
		System.out.println("Deposited: "+m+"/-");
		System.out.println("=============================");	
		d=m;
		flag=1;
		count++;
	}

	public void Withdraw()
	{
		System.out.print("Withdraw Amount: ");
		c=sc.nextInt();
		if (c>m)
		{
			System.out.println("// Account balance is only "+m+"/- //");
			System.out.println("=============================");
		}
		else 
		{
			System.out.println("Withdrawn: "+c+"/-");
			System.out.println("=============================");
			m=m-c;
			flag=2;
			count++;
	    }
	}

	public void Ptran()							
	{
		if (flag==1)
		{
			System.out.println("Deposited: "+d+"/-");
		}
		else if (flag==2) 			
		{
			System.out.println("Withdrawn: "+c+"/-");
		}
			System.out.println("=============================");
	}

	public int Exit()
	{
		System.out.println("Thanyou for using our service.");
		int i=1;
		return i;
	}

	public Project(int a)
	{
		System.out.println("=============================");
		if (a==1004)
		{
			System.out.println("// "+a+" //");
			System.out.println("Hello, Shaad Qureshi");
			System.out.println("Acount no: 2020768909");
			System.out.println("IFSC code: RTY36778");	
		}
		else if (a==1005)
		{
			System.out.println("// "+a+" //");
			System.out.println("Hello, Pratyusha Patodkar");
			System.out.println("Account no: 2018257898");
			System.out.println("IFSC code: WDR46907");
		}
		else if (a==1006)
		{
			System.out.println("// "+a+" //");
			System.out.println("Hello, Rishabh Singh");
			System.out.println("Account no: 2016256090");
			System.out.println("IFSC code: ADE60993");	
		}
		System.out.println();

		System.out.println("How can we help you?");
		System.out.println("A: Check Balance");
		System.out.println("B: Deposit");
		System.out.println("C: Withdraw");
		System.out.println("D: Previous Transaction");
		System.out.println("E: Exit");
		System.out.println("=============================");
	}

	public Project(String a, String b)
	{
		System.out.println("=============================");
		System.out.println("Hello, "+a);
		System.out.println("PAN no: "+b);
		System.out.println();

		System.out.println("How can we help you?");
		System.out.println("A: Check Balance");
		System.out.println("B: Deposit");
		System.out.println("C: Withdraw");
		System.out.println("D: Previous Transaction");
		System.out.println("E: Exit");
		System.out.println("=============================");
	}
}

class Bankacc
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		int i=0;
		System.out.println("--------------------");
		System.out.println("// Welcome to BOI //");
		System.out.println("--------------------");
		
		int t=0;
		while(t==0)
		{
			System.out.println("=============================");
			System.out.print("Existing/New User or Exit?: ");
			String user=sc.next();

			if (user.equals("Existing") || user.equals("existing"))
			{
				System.out.println("=============================");
				System.out.print("Enter your BOI id: ");
				a[i]=sc.nextInt();

				if (a[i]==1004 || a[i]==1005 || a[i]==1006)
				{
					Project p=new Project(a[i]);
			        int l=0;
					while (l==0)
					{
						System.out.print("Enter any option: ");
						String op=sc.next();

						if (op.equals("A"))
						{
							p.Checkbalance();
						}
						else if (op.equals("B"))
						{
							p.Deposit();		
						}
						else if (op.equals("C")) 
						{
							p.Withdraw();
						}
						else if (op.equals("D")) 
						{
							p.Ptran();
						}
						else if (op.equals("E"))
						{
							l=p.Exit();
						}
					}
				}
			}	

			else if (user.equals("New") || user.equals("new"))
			{
				System.out.println("=============================");
				System.out.println("/Enter your details/");
				System.out.print("Name: ");
				String name=sc.next();
				System.out.print("PAN no: ");
				String pan=sc.next();
				Project p=new Project(name,pan);

				int l=0;
					while (l==0)
					{
						System.out.print("Enter any option: ");
						String op=sc.next();

						if (op.equals("A"))
						{
							p.Checkbalance();
						}
						else if (op.equals("B"))
						{
							p.Deposit();		
						}
						else if (op.equals("C")) 
						{
							p.Withdraw();
						}
						else if (op.equals("D")) 
						{
							p.Ptran();
						}	 
						else if (op.equals("E"))
						{
							l=p.Exit();
						}
					}
			}	

			else if(user.equals("Exit") || user.equals("exit")) 
			{
				System.out.println("Thanyou for visiting BOI.");
				t=1;
			}

			else
			{
				System.out.println("Invalid input.");
			}
		}
	}
}

				
