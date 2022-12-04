package lab_email.CredentialServices;

import java.util.Random;

public class email 
{
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String companySuffix="abc.com";
	
	public email(String firstName, String lastName, String department)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.department=department;
		this.password = generatePassword();
		generateEmailAddress(this.firstName, this.lastName, this.department);
		showCredentials();
	}
			
	public void generateEmailAddress(String firstName, String lastName, String department)
	{
		email =firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		//System.out.println("Credentials Successfully Generated");
	}
	
	public String generatePassword()
	{
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[10];

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< 10 ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      return new String(password);
		
	}
	
	public void showCredentials()
	{
		System.out.println("Dear "+ firstName+ " your generated credentials are as follows");
		System.out.println("Email 	 ---> "+email);
		System.out.println("Password ---> "+password);
	}
}
