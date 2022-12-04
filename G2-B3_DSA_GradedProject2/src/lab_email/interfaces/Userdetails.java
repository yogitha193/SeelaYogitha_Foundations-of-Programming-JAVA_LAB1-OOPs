package lab_email.interfaces;

public interface Userdetails
{
	public String generateEmailAddress(String firstName, String lastName, String department);
	public String generatePassword();
	public void showCredentials();
}
