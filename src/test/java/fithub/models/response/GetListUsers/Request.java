package fithub.models.response.GetListUsers;

import java.util.List;
import lombok.Data;

@Data
public class Request{
	private String method;
	private List<Object> header;
	private Url url;
}