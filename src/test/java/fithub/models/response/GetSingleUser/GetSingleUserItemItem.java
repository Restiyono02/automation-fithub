package fithub.models.response.GetSingleUser;

import java.util.List;
import lombok.Data;

@Data
public class GetSingleUserItemItem {
	private Request request;
	private List<Object> response;
	private String name;
}