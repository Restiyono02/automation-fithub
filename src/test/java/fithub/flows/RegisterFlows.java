package fithub.flows;

import com.google.inject.Inject;
import com.testvagrant.ekam.commons.LayoutInitiator;
import fithub.client.RegisterSuccessfulClient;
import fithub.models.request.RegisterSuccessful.RegisterSuccessfulRequest;
import fithub.models.response.RegisterSuccessful.RegisterSuccessfulResponse;
import retrofit2.Response;

public class RegisterFlows {

    @Inject
    RegisterSuccessfulRequest registerSuccessfulRequest;

    public Response<RegisterSuccessfulResponse> getRegisterSuccessful(String password, String email){
        RegisterSuccessfulClient registerSuccessfulClient = LayoutInitiator.Client(RegisterSuccessfulClient.class);
        RegisterSuccessfulRequest registerSuccessfulRequest = this.registerSuccessfulRequest
                .setRegisterSuccessful(password, email);
        Response<RegisterSuccessfulResponse> registerSuccessful = registerSuccessfulClient
                .validateRegisterSuccessful(registerSuccessfulRequest);
        return registerSuccessful;
    }

    public Response<RegisterSuccessfulResponse> getRegisterUnsuccessful(String password, String email){
        RegisterSuccessfulClient registerSuccessfulClient = LayoutInitiator.Client(RegisterSuccessfulClient.class);
        RegisterSuccessfulRequest registerSuccessfulRequest = this.registerSuccessfulRequest
                .setRegisterUnsuccessful(password, email);
        Response<RegisterSuccessfulResponse> registerSuccessful = registerSuccessfulClient
                .validateRegisterSuccessful(registerSuccessfulRequest);
        return registerSuccessful;
    }
}
