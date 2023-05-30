package fithub.models.response.GetSingleUserNotFound;

import java.util.List;
import lombok.Data;

@Data
public class GetSingleUserNotFoundItemItem {
	private Request request;
	private List<Object> response;
	private String name;
}