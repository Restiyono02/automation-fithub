package fithub.models.response.GetListResource;

import java.util.List;
import lombok.Data;

@Data
public class GetListResourceResponse{
	private List<GetListResourceItemItem> item;
	private GetListResourceInfo info;
}