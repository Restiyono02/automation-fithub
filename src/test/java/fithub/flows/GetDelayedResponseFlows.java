package fithub.flows;

import com.testvagrant.ekam.commons.LayoutInitiator;
import fithub.client.GetDelayedResponseClient;
import fithub.models.response.GetDelayedResponse.GetDelayedlResponse;
import retrofit2.Response;

public class GetDelayedResponseFlows {
    public Response<GetDelayedlResponse> validateGetDelayedResponse(){
        GetDelayedResponseClient getDelayedResponseClient = LayoutInitiator.Client(GetDelayedResponseClient.class);
        Response<GetDelayedlResponse> getDelayedlResponse = getDelayedResponseClient.validateGetDelayedResponse();
        return getDelayedlResponse;
    }
}
