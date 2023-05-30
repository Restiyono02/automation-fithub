package fithub.client;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import fithub.models.response.GetListResource.GetListResourceResponse;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import com.testvagrant.ekam.reports.annotations.APIStep;

public class GetListResourceClient extends RetrofitBaseClient {

    private interface GetListResourceService {
        @GET("/api/unknown")
        Call<GetListResourceResponse> listResource();
    }

    private final GetListResourceService service;

    @Inject
    public GetListResourceClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(GetListResourceService.class);
    }

    @APIStep(keyword = "When", description = "verify get list resource")
    public Response<GetListResourceResponse> validateListResource(){
        Call<GetListResourceResponse> getListResourceResponseCall = service.listResource();
        return httpClient.executeAsResponse(getListResourceResponseCall);
    }
}