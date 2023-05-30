package fithub.client;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import fithub.models.response.GetSingleUserNotFound.GetSingleUserNotFoundResponse;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import com.testvagrant.ekam.reports.annotations.APIStep;

public class GetSingleUserNotFoundClient extends RetrofitBaseClient {

    private interface GetSingleUserNotFoundService {
        @GET("/api/users/23")
        Call<GetSingleUserNotFoundResponse> singleUserNotFound();
    }

    private final GetSingleUserNotFoundService service;

    @Inject
    public GetSingleUserNotFoundClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(GetSingleUserNotFoundService.class);
    }

    @APIStep(keyword = "When", description = "verify get single user not found")
    public Response<GetSingleUserNotFoundResponse> validateSingleUserNotFound(){
        Call<GetSingleUserNotFoundResponse> getSingleUserNotFoundResponseCall = service.singleUserNotFound();
        return httpClient.executeAsResponse(getSingleUserNotFoundResponseCall);
    }
}