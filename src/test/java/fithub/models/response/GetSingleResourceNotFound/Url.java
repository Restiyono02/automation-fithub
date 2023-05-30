package fithub.models.response.GetSingleResourceNotFound;

import java.util.List;
import lombok.Data;

@Data
public class Url{
	private List<String> path;
	private String protocol;
	private List<String> host;
	private String raw;
}