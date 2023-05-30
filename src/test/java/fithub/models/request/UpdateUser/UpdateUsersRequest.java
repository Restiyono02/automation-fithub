package fithub.models.request.UpdateUser;

import com.google.inject.Inject;
import com.testvagrant.ekam.commons.data.DataSetsClient;
import lombok.Data;

@Data
public class UpdateUsersRequest{

	@Inject
	DataSetsClient dataSetsClient;

	private String name;
	private String job;

	public UpdateUsersRequest setUpdateUsers(String name, String job) {
		UpdateUsersRequest updateUsersRequest = dataSetsClient
				.getValue("update_users", UpdateUsersRequest.class);
		updateUsersRequest.setName(name);
		updateUsersRequest.setJob(job);
		return updateUsersRequest;
	}
}