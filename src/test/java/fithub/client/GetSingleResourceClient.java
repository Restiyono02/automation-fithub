package fithub.client;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import fithub.models.response.GetSingleResource.GetSingleResourceResponse;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import com.testvagrant.ekam.reports.annotations.APIStep;

public class GetSingleResourceClient extends RetrofitBaseClient {

    private interface GetSingleResourceService {
        @GET("/api/unknown/2")
        Call<GetSingleResourceResponse> singleResource();
    }

    private final GetSingleResourceService service;

    @Inject
    public GetSingleResourceClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(GetSingleResourceService.class);
    }

    @APIStep(keyword = "When", description = "verify get single resource")
    public Response<GetSingleResourceResponse> validateSingleResource(){
        Call<GetSingleResourceResponse> getSingleResourceResponseCall = service.singleResource();
        return httpClient.executeAsResponse(getSingleResourceResponseCall);
    }
}