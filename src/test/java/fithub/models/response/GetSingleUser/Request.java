package fithub.models.response.GetSingleUser;

import java.util.List;
import lombok.Data;

@Data
public class Request{
	private String method;
	private List<Object> header;
	private Url url;
}