package fithub.models.response.GetListResource;

import java.util.List;
import lombok.Data;

@Data
public class GetListResourceItemItem {
	private Request request;
	private List<Object> response;
	private String name;
}