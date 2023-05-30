package fithub.models.response.GetSingleResource;

import java.util.List;
import lombok.Data;

@Data
public class GetSingleResourceResponse{
	private List<GetSingleResourceItemItem> item;
	private GetSingleResourceInfo info;
}