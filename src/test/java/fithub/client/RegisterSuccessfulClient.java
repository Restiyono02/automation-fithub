package fithub.client;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import fithub.models.request.RegisterSuccessful.RegisterSuccessfulRequest;
import fithub.models.response.RegisterSuccessful.RegisterSuccessfulResponse;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import com.testvagrant.ekam.reports.annotations.APIStep;

public class RegisterSuccessfulClient extends RetrofitBaseClient {

    private interface RegisterSuccessfulService {
                @POST("/api/register")
        Call<RegisterSuccessfulResponse> registerSuccessful(@Body RegisterSuccessfulRequest request,
                                                            @Header("Content-Type") String contentType);
    }

    private final RegisterSuccessfulService service;

    @Inject
    public RegisterSuccessfulClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(RegisterSuccessfulService.class);
    }

    @APIStep(keyword = "When", description = "verify register")
    public Response<RegisterSuccessfulResponse> validateRegisterSuccessful(RegisterSuccessfulRequest request){
        Call<RegisterSuccessfulResponse> registerSuccessfulResponseCall = service
                .registerSuccessful(request, "application/json");
        return httpClient.executeAsResponse(registerSuccessfulResponseCall);
    }
}