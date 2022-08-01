package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCap = 500;
	private String email;
	private int defaultPasswordLength = 8;
	private String alternateEmail;
	private String companySuffix ="techcompany.com";
	
	public Email(String firstName , String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email created :" +this.firstName + " " + this.lastName);
		
		// call a method asking for department - return department.
		this.department = setDepartment();
		//System.out.println("Department: "+ this.department);
		
		// call a method that returns password
		this.password = randomPassword(defaultPasswordLength);
			System.out.println("Password: " + this.password);
		//combine elements to generate email
		email =firstName.toLowerCase()+""+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		//System.out.println("your email is :" + email);
	}
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES\n1 for sales \n2 for development\n3 for accounting\n0 for nothing \nenter the department code: ");
		Scanner in  = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {
			return "sales";
		}
		else if(depChoice == 2) {
			return  "dev";
		}
		else if(depChoice == 3) {
			return "acct";
		}
		else {
			return "nothing";
		}
	}
		private String randomPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVabcdefghiklmn12345785@#$%";
			char[] password = new char[length];
			for(int i = 0 ; i <length ; i++) {
				int rand = (int)(Math.random()*passwordSet.length());
				password[i] = passwordSet.charAt(rand);			}
		
		return new String(password);
	}
		//set the mailbox cap
		public void setmailboxCap(int capacity) {
		this.mailboxCap = capacity;
		
}
		//set the alternate email
		public void setAlternateEmail(String altEmail) {
			this.alternateEmail =altEmail;
		}
		//change the password
		public void changePassword(String password) {
			this.password =password;
		}
		public int getmailboxCap() {
			return mailboxCap;
		}
		public String getalternateEmail() {
			return alternateEmail;
		}
		public String getpassword() {
			return password;
		}
		public String showInfo() {
			return "Display Name: " + firstName + "" + lastName+
					"\nCompany Email: " + email +
					"\nMailbox Capacity: " + mailboxCap +  " mb";
		}
}
