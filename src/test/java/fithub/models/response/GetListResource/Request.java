package fithub.models.response.GetListResource;

import java.util.List;
import lombok.Data;

@Data
public class Request{
	private String method;
	private List<Object> header;
	private Url url;
}