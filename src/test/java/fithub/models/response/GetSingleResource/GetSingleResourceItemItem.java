package fithub.models.response.GetSingleResource;

import java.util.List;
import lombok.Data;

@Data
public class GetSingleResourceItemItem {
	private Request request;
	private List<Object> response;
	private String name;
}