package fithub.flows;

import com.google.inject.Inject;
import com.testvagrant.ekam.commons.LayoutInitiator;
import fithub.client.LoginSuccessfulClient;
import fithub.models.request.LoginSuccessful.LoginSuccessfulRequest;
import fithub.models.response.Login.LoginSuccessfulResponse;
import retrofit2.Response;

public class LoginFlows {

    @Inject
    LoginSuccessfulRequest loginSuccessfulRequest;

    public Response<LoginSuccessfulResponse> getLoginSuccessful(String password, String email){
        LoginSuccessfulClient loginSuccessfulClient = LayoutInitiator.Client(LoginSuccessfulClient.class);
        LoginSuccessfulRequest loginSuccessfulRequest = this.loginSuccessfulRequest
                .setLoginSuccessful(password, email);
        Response<LoginSuccessfulResponse> loginSuccessful = loginSuccessfulClient
                .validateLoginSuccessful(loginSuccessfulRequest);
        return loginSuccessful;
    }

    public Response<LoginSuccessfulResponse> getLoginUnsuccessful(String password, String email){
        LoginSuccessfulClient loginSuccessfulClient = LayoutInitiator.Client(LoginSuccessfulClient.class);
        LoginSuccessfulRequest loginSuccessfulRequest = this.loginSuccessfulRequest
                .setLoginUnSuccessful(password, email);
        Response<LoginSuccessfulResponse> loginSuccessful = loginSuccessfulClient
                .validateLoginSuccessful(loginSuccessfulRequest);
        return loginSuccessful;
    }
}
