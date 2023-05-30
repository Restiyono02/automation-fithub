package fithub.tests;

import com.google.inject.Inject;
import com.testvagrant.ekam.testBases.testng.APITest;
import fithub.flows.*;
import fithub.models.response.CreateUser.CreateUsersResponse;
import fithub.models.response.GetDelayedResponse.GetDelayedlResponse;
import fithub.models.response.GetListResource.GetListResourceResponse;
import fithub.models.response.GetListUsers.GetListUsersResponse;
import fithub.models.response.GetSingleResource.GetSingleResourceResponse;
import fithub.models.response.GetSingleResourceNotFound.GetSingleResourceNotFoundResponse;
import fithub.models.response.GetSingleUser.GetSingleUserResponse;
import fithub.models.response.GetSingleUserNotFound.GetSingleUserNotFoundResponse;
import fithub.models.response.Login.LoginSuccessfulResponse;
import fithub.models.response.RegisterSuccessful.RegisterSuccessfulResponse;
import fithub.models.response.UpdateUser.UpdateUsersResponse;
import org.testng.annotations.Test;
import retrofit2.Response;

public class automation extends APITest {

    @Inject
    GetListUsersFlows getListUsersFlows;

    @Inject
    GetSingleUserFlows getSingleUserFlows;

    @Inject
    GetSingleUserNotFoundFlows getSingleUserNotFoundFlows;

    @Inject
    GetListResourceFlows getListResourceFlows;

    @Inject
    GetSingleResourceFlows getSingleResourceFlows;

    @Inject
    GetSingleResourceNotFoundFlows getSingleResourceNotFoundFlows;

    @Inject
    CreateUsersFlows createUsersFlows;

    @Inject
    UpdateUsersFlows updateUsersFlows;

    @Inject
    RegisterFlows registerFlows;

    @Inject
    LoginFlows loginFlows;

    @Inject
    GetDelayedResponseFlows getDelayedResponseFlows;

    @Test
    public void validateGetListUsers() {
        Response<GetListUsersResponse> getListUsersResponse = getListUsersFlows.validateListUsers();

        System.out.println(getListUsersResponse);
    }

    @Test
    public void validateGetSingleUser() {
        Response<GetSingleUserResponse> getSingleUserResponse = getSingleUserFlows.validateSingleUser();

        System.out.println(getSingleUserResponse);
    }

    @Test
    public void validateGetSingleUserNotFound() {
        Response<GetSingleUserNotFoundResponse> getSingleUserNotFoundResponse = getSingleUserNotFoundFlows
                .validateSingleUserNotFound();

        System.out.println(getSingleUserNotFoundResponse);
    }

    @Test
    public void validateGetListResource() {
        Response<GetListResourceResponse> getListResourceResponse = getListResourceFlows.validateListResource();

        System.out.println(getListResourceResponse);
    }

    @Test
    public void validateGetSingleResource() {
        Response<GetSingleResourceResponse> getSingleResourceResponse = getSingleResourceFlows
                .validateSingleResource();

        System.out.print(getSingleResourceResponse);
    }

    @Test
    public void validateGetSingleResourceNotFound() {
        Response<GetSingleResourceNotFoundResponse> getSingleResourceNotFoundResponse = getSingleResourceNotFoundFlows
                .validateSingleResourceNotFound();

        System.out.print(getSingleResourceNotFoundResponse);
    }

    @Test
    public void validateCreateUsers() {
        String name = "morpheus";
        String job = "leader";
        Response<CreateUsersResponse> createUsersResponse = createUsersFlows.getCreateUsers(name, job);

        System.out.print(createUsersResponse);
    }

    @Test
    public void validateUpdateUsers() {
        String name = "morpheus";
        String job = "zion resident";
        Response<UpdateUsersResponse> updateUsersResponse = updateUsersFlows.getUpdateUsers(name, job);

        System.out.print(updateUsersResponse);
    }

    @Test
    public void validateRegisterSuccessful() {
        String password = "pistol";
        String email = "eve.holt@reqres.in";
        Response<RegisterSuccessfulResponse> registerSuccessfulResponse = registerFlows
                .getRegisterSuccessful(password, email);

        System.out.print(registerSuccessfulResponse);
    }

    @Test
    public void validateRegisterUnsuccessful() {
        String password = "";
        String email = "eve.holt@reqres.in";
        Response<RegisterSuccessfulResponse> registerSuccessfulResponse = registerFlows
                .getRegisterUnsuccessful(password, email);

        System.out.print(registerSuccessfulResponse);
    }

    @Test
    public void validateLoginSuccessful() {
        String password = "cityslicka";
        String email = "eve.holt@reqres.in";
        Response<LoginSuccessfulResponse> loginSuccessfulResponse = loginFlows
                .getLoginSuccessful(password, email);

        System.out.print(loginSuccessfulResponse);
    }

    @Test
    public void validateLoginUnsuccessful() {
        String password = "";
        String email = "peter@klaven";
        Response<LoginSuccessfulResponse> loginSuccessfulResponse = loginFlows
                .getLoginUnsuccessful(password, email);

        System.out.print(loginSuccessfulResponse);
    }

    @Test
    public void validateGetDelayedResponse() {

        Response<GetDelayedlResponse> getDelayedlResponse = getDelayedResponseFlows
                .validateGetDelayedResponse();

        System.out.print(getDelayedlResponse);
    }
}
