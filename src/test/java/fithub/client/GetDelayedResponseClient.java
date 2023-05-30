package fithub.client;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import fithub.models.response.GetDelayedResponse.GetDelayedlResponse;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import com.testvagrant.ekam.reports.annotations.APIStep;

public class GetDelayedResponseClient extends RetrofitBaseClient {

    private interface GetDelayedResponseService {
                @GET("/api/users?delay=3")
        Call<GetDelayedlResponse> delayedResponse();
    }

    private final GetDelayedResponseService service;

    @Inject
    public GetDelayedResponseClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(GetDelayedResponseService.class);
    }

    @APIStep(keyword = "When", description = "verify Get Delayed Response")
    public Response<GetDelayedlResponse> validateGetDelayedResponse(){
        Call<GetDelayedlResponse> getDelayedlResponseCall = service.delayedResponse();
        return httpClient.executeAsResponse(getDelayedlResponseCall);
    }
}