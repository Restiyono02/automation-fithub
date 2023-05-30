package fithub.models.response.GetListUsers;

import java.util.List;
import lombok.Data;

@Data
public class Url{
	private List<String> path;
	private String protocol;
	private List<QueryItem> query;
	private List<String> host;
	private String raw;
}