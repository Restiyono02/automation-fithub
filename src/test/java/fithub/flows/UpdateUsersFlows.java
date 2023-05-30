package fithub.flows;

import com.google.inject.Inject;
import com.testvagrant.ekam.commons.LayoutInitiator;
import fithub.client.UpdateUserClient;
import fithub.models.request.UpdateUser.UpdateUsersRequest;
import fithub.models.response.UpdateUser.UpdateUsersResponse;
import retrofit2.Response;

public class UpdateUsersFlows {
    @Inject
    UpdateUsersRequest updateUsersRequest;

    public Response<UpdateUsersResponse> getUpdateUsers(String name, String job){
        UpdateUserClient updateUserClient = LayoutInitiator.Client(UpdateUserClient.class);
        UpdateUsersRequest updateUsersRequest = this.updateUsersRequest.setUpdateUsers(name, job);
        Response<UpdateUsersResponse> updateUser = updateUserClient
                .validateUpdateUsers(updateUsersRequest);
        return updateUser;
    }
}
