package fithub.client;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import fithub.models.request.LoginSuccessful.LoginSuccessfulRequest;
import fithub.models.response.Login.LoginSuccessfulResponse;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import com.testvagrant.ekam.reports.annotations.APIStep;

public class LoginSuccessfulClient extends RetrofitBaseClient {

    private interface LoginSuccessfulService {
                @POST("/api/login")
        Call<LoginSuccessfulResponse> loginSuccessful(@Body LoginSuccessfulRequest request,
                                                      @Header("Content-Type") String contentType);
    }

    private final LoginSuccessfulService service;

    @Inject
    public LoginSuccessfulClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(LoginSuccessfulService.class);
    }

    @APIStep(keyword = "When", description = "verify login")
    public Response<LoginSuccessfulResponse> validateLoginSuccessful(LoginSuccessfulRequest request){
        Call<LoginSuccessfulResponse> loginSuccessfulResponseCall = service
                .loginSuccessful(request, "application/json");
        return httpClient.executeAsResponse(loginSuccessfulResponseCall);
    }
}