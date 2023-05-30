package fithub.flows;

import com.testvagrant.ekam.commons.LayoutInitiator;
import fithub.client.GetListResourceClient;
import fithub.models.response.GetListResource.GetListResourceResponse;
import retrofit2.Response;

public class GetListResourceFlows {
    public Response<GetListResourceResponse> validateListResource() {
        GetListResourceClient getListResourceClient = LayoutInitiator.Client(GetListResourceClient.class);
        Response<GetListResourceResponse> getListResourceResponse = getListResourceClient
                .validateListResource();
        return getListResourceResponse;
    }
}
