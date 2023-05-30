package fithub.models.request.LoginSuccessful;

import com.google.inject.Inject;
import com.testvagrant.ekam.commons.data.DataSetsClient;
import lombok.Data;

@Data
public class LoginSuccessfulRequest{

	@Inject
	DataSetsClient dataSetsClient;

	private String password;
	private String email;

	public LoginSuccessfulRequest setLoginSuccessful(String password, String email) {
		LoginSuccessfulRequest loginSuccessfulRequest = dataSetsClient
				.getValue("login_successful", LoginSuccessfulRequest.class);
		loginSuccessfulRequest.setPassword(password);
		loginSuccessfulRequest.setEmail(email);
		return loginSuccessfulRequest;
	}

	public LoginSuccessfulRequest setLoginUnSuccessful(String password, String email) {
		LoginSuccessfulRequest loginSuccessfulRequest = dataSetsClient
				.getValue("login_unsuccessful", LoginSuccessfulRequest.class);
		loginSuccessfulRequest.setPassword(password);
		loginSuccessfulRequest.setEmail(email);
		return loginSuccessfulRequest;
	}
}