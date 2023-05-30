package fithub.models.response.GetSingleResourceNotFound;

import java.util.List;
import lombok.Data;

@Data
public class GetSingleResourceNotFoundItemItem {
	private Request request;
	private List<Object> response;
	private String name;
}