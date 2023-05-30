package fithub.client;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import fithub.models.request.CreateUser.CreateUsersRequest;
import fithub.models.response.CreateUser.CreateUsersResponse;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import com.testvagrant.ekam.reports.annotations.APIStep;
import utils.TestData;

public class CreateUsersClient extends RetrofitBaseClient {

    private interface CreateUsersService {
        @POST("/api/users")
        Call<CreateUsersResponse> createUser(@Body CreateUsersRequest request,
                                             @Header("Content-Type") String contentType);
    }

    private final CreateUsersService service;

    @Inject
    public CreateUsersClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(CreateUsersService.class);
    }

    @APIStep(keyword = "When", description = "verify Create Users")
    public Response<CreateUsersResponse> validateCreateUsers(CreateUsersRequest request){
        Call<CreateUsersResponse> createUsersResponseCall = service
                .createUser(request, "application/json");
        return httpClient.executeAsResponse(createUsersResponseCall);
    }
}