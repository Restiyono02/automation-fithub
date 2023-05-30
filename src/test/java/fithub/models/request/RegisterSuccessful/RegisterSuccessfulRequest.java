package fithub.models.request.RegisterSuccessful;

import com.google.inject.Inject;
import com.testvagrant.ekam.commons.data.DataSetsClient;
import lombok.Data;

@Data
public class RegisterSuccessfulRequest{

	@Inject
	DataSetsClient dataSetsClient;

	private String password;
	private String email;

	public RegisterSuccessfulRequest setRegisterSuccessful(String password, String email) {
		RegisterSuccessfulRequest registerSuccessfulRequest = dataSetsClient
				.getValue("register_successful", RegisterSuccessfulRequest.class);
		registerSuccessfulRequest.setPassword(password);
		registerSuccessfulRequest.setEmail(email);
		return registerSuccessfulRequest;
	}

	public RegisterSuccessfulRequest setRegisterUnsuccessful(String password, String email) {
		RegisterSuccessfulRequest registerSuccessfulRequest = dataSetsClient
				.getValue("register_unsuccessful", RegisterSuccessfulRequest.class);
		registerSuccessfulRequest.setPassword(password);
		registerSuccessfulRequest.setEmail(email);
		return registerSuccessfulRequest;
	}
}