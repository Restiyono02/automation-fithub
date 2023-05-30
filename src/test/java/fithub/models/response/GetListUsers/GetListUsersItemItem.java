package fithub.models.response.GetListUsers;

import java.util.List;
import lombok.Data;

@Data
public class GetListUsersItemItem {
	private Request request;
	private List<Object> response;
	private String name;
}