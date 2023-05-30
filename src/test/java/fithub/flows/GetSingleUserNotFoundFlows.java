package fithub.flows;

import com.testvagrant.ekam.commons.LayoutInitiator;
import fithub.client.GetSingleUserNotFoundClient;
import fithub.models.response.GetSingleUserNotFound.GetSingleUserNotFoundResponse;
import retrofit2.Response;

public class GetSingleUserNotFoundFlows {
    public Response<GetSingleUserNotFoundResponse> validateSingleUserNotFound() {
        GetSingleUserNotFoundClient getSingleUserNotFoundClient = LayoutInitiator
                .Client(GetSingleUserNotFoundClient.class);
        Response<GetSingleUserNotFoundResponse> getSingleUserNotFoundResponse = getSingleUserNotFoundClient
                .validateSingleUserNotFound();
        return getSingleUserNotFoundResponse;
    }
}
