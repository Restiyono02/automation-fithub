package fithub.flows;

import com.testvagrant.ekam.commons.LayoutInitiator;
import fithub.client.GetSingleResourceClient;
import fithub.models.response.GetSingleResource.GetSingleResourceResponse;
import retrofit2.Response;

public class GetSingleResourceFlows {
    public Response<GetSingleResourceResponse> validateSingleResource() {
        GetSingleResourceClient getSingleResourceClient = LayoutInitiator.Client(GetSingleResourceClient.class);
        Response<GetSingleResourceResponse> getSingleResourceResponse = getSingleResourceClient
                .validateSingleResource();
        return getSingleResourceResponse;
    }
}
