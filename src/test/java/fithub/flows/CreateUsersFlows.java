package fithub.flows;

import com.google.inject.Inject;
import com.testvagrant.ekam.commons.LayoutInitiator;
import fithub.client.CreateUsersClient;
import fithub.models.request.CreateUser.CreateUsersRequest;
import fithub.models.response.CreateUser.CreateUsersResponse;
import retrofit2.Response;

public class CreateUsersFlows {

    @Inject
    CreateUsersRequest createUsersRequest;

    public Response<CreateUsersResponse> getCreateUsers(String name, String job){
        CreateUsersClient createUsersClient = LayoutInitiator.Client(CreateUsersClient.class);
        CreateUsersRequest createUsersRequest = this.createUsersRequest.setCreateUsers(name, job);
        Response<CreateUsersResponse> createUser = createUsersClient
                .validateCreateUsers(createUsersRequest);
        return createUser;
    }
}
