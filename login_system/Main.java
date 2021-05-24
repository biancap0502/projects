
public class Main {

	public static void main(String[] args) {
		
		IDPasswords idAndPasswords = new IDPasswords();
		LoginPage loginPage = new LoginPage(idAndPasswords.getLoginInfo());

	}

}
