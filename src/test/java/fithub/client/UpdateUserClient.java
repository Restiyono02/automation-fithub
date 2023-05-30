package fithub.client;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import fithub.models.request.UpdateUser.UpdateUsersRequest;
import fithub.models.response.UpdateUser.UpdateUsersResponse;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.PUT;
import com.testvagrant.ekam.reports.annotations.APIStep;

public class UpdateUserClient extends RetrofitBaseClient {

    private interface UpdateUserService {
                @PUT("/api/users/2")
        Call<UpdateUsersResponse> updateUser(@Body UpdateUsersRequest request,
                                             @Header("Content-Type") String contentType);
    }

    private final UpdateUserService service;

    @Inject
    public UpdateUserClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(UpdateUserService.class);
    }

    @APIStep(keyword = "When", description = "verify Update Users")
    public Response<UpdateUsersResponse> validateUpdateUsers(UpdateUsersRequest request){
        Call<UpdateUsersResponse> updateUsersResponseCall = service
                .updateUser(request, "application/json");
        return httpClient.executeAsResponse(updateUsersResponseCall);
    }
}