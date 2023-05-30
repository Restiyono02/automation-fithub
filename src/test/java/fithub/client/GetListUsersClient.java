package fithub.client;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import fithub.models.response.GetListUsers.GetListUsersResponse;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import com.testvagrant.ekam.reports.annotations.APIStep;

public class GetListUsersClient extends RetrofitBaseClient {

    private interface GetListUsersService {
        @GET("/api/users?page=2")
        Call<GetListUsersResponse> getlistUsers();
    }

    private final GetListUsersService service;

    @Inject
    public GetListUsersClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(GetListUsersService.class);
    }

    @APIStep(keyword = "When", description = "verify get list users")
    public Response<GetListUsersResponse> validatListUsers(){
        Call<GetListUsersResponse> getListUsersResponseCall = service.getlistUsers();
        return httpClient.executeAsResponse(getListUsersResponseCall);
    }
}