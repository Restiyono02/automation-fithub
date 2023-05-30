package fithub.flows;

import com.testvagrant.ekam.commons.LayoutInitiator;
import fithub.client.GetSingleResourceNotFoundClient;
import fithub.models.response.GetSingleResourceNotFound.GetSingleResourceNotFoundResponse;
import retrofit2.Response;

public class GetSingleResourceNotFoundFlows {
    public Response<GetSingleResourceNotFoundResponse> validateSingleResourceNotFound() {
        GetSingleResourceNotFoundClient getSingleResourceNotFoundClient = LayoutInitiator
                .Client(GetSingleResourceNotFoundClient.class);
        Response<GetSingleResourceNotFoundResponse> getSingleResourceNotFoundResponse = getSingleResourceNotFoundClient
                .validateSingleResourceNotFound();
        return getSingleResourceNotFoundResponse;
    }
}
