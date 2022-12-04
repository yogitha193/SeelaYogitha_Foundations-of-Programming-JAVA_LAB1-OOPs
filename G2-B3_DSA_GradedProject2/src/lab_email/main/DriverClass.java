package lab_email.main;
import java.util.*;

import lab_email.CredentialServices.email;
import lab_email.model.Employee;
public class DriverClass 
{
	public static void main(String args[])
	{
		Employee e = new Employee("Harshit","Choudary");

		int choice;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("\nPlease enter the department from the following\n1. Technical\n2. Admin\n3. Human Resource\n4. Legal\n0. Exit\n");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					email em =new email(e.getFirstName(), e.getLastName(),"tech");
					break;
				}
				case 2:
				{
					email em =new email(e.getFirstName(), e.getLastName(),"admin");
					break;
				}
				case 3:
				{
					email em =new email(e.getFirstName(), e.getLastName(),"hr");
					break;
				}
				case 4:
				{
					email em =new email(e.getFirstName(), e.getLastName(),"legal");
					break;
				}
				case 0:
				{
					System.out.println("Thank You");
					break;
				}
				default:
				{
					System.out.println("Enter a valid option");
				}			
			}
		}
		while(choice!=0);
		

		
	}
}
