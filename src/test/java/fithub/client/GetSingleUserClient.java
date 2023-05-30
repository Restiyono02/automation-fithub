package fithub.client;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import fithub.models.response.GetSingleUser.GetSingleUserResponse;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import com.testvagrant.ekam.reports.annotations.APIStep;

public class GetSingleUserClient extends RetrofitBaseClient {

    private interface GetSingleUserService {
        @GET("/api/users/2")
        Call<GetSingleUserResponse> singleUser();
    }

    private final GetSingleUserService service;

    @Inject
    public GetSingleUserClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(GetSingleUserService.class);
    }

    @APIStep(keyword = "When", description = "verify single user")
    public Response<GetSingleUserResponse> validateSingleUser() {
        Call<GetSingleUserResponse> getSingleUserResponseCall = service.singleUser();
        return httpClient.executeAsResponse(getSingleUserResponseCall);
    }
}