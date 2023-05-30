package fithub.flows;

import com.testvagrant.ekam.commons.LayoutInitiator;
import fithub.client.GetSingleUserClient;
import fithub.models.response.GetSingleUser.GetSingleUserResponse;
import retrofit2.Response;

public class GetSingleUserFlows {
    public Response<GetSingleUserResponse> validateSingleUser() {
        GetSingleUserClient getSingleUserClient = LayoutInitiator.Client(GetSingleUserClient.class);
        Response<GetSingleUserResponse> getSingleUserResponse = getSingleUserClient.validateSingleUser();
        return getSingleUserResponse;
    }
}
