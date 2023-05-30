package fithub.models.request.CreateUser;

import com.google.inject.Inject;
import com.testvagrant.ekam.commons.data.DataSetsClient;
import lombok.Data;

@Data
public class CreateUsersRequest{

	@Inject
	DataSetsClient dataSetsClient;

	private String name;
	private String job;

	public CreateUsersRequest setCreateUsers(String name, String job) {
		CreateUsersRequest createUsersRequest = dataSetsClient
				.getValue("create_users", CreateUsersRequest.class);
		createUsersRequest.setName(name);
		createUsersRequest.setJob(job);
		return createUsersRequest;
	}
}