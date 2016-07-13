package mvcdemo.model;

import java.util.HashMap;

public class Authenticator {

	private static HashMap<String, String> users;
	static
	{
		users = new HashMap<String, String>();
		users.put("ryan", "password");
		users.put("sara", "password");
	}
	
	public String authenticate(String username, String password) {
		if ((users.containsKey(username))
				&& (users.get(username).equals(password))) {
			return "success";
		} else {
			return "failure";
		}
	}
	
}
