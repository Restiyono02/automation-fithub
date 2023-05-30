package fithub.models.response.GetSingleResourceNotFound;

import java.util.List;
import lombok.Data;

@Data
public class GetSingleResourceNotFoundResponse{
	private List<GetSingleResourceNotFoundItemItem> item;
	private GetSingleResourceNotFoundInfo info;
}