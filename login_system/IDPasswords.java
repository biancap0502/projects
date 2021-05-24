import java.util.HashMap;
import java.util.Map;

public class IDPasswords {
	
	Map<String, String> loginInfo = new HashMap<String, String>();
	
	public IDPasswords() {
		loginInfo.put("first", "first");
		loginInfo.put("SecondUsername", "SecondPassword");
		loginInfo.put("ThirdUsername", "ThirdPassword");
		
	}
	
	public Map<String, String> getLoginInfo() {
		return loginInfo;
	}

}
