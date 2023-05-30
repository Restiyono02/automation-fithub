package fithub.models.response.GetDelayedResponse;

import java.util.List;
import lombok.Data;

@Data
public class GetDelayedlResponse{
	private int perPage;
	private int total;
	private List<GetDelayedDataItem> data;
	private int page;
	private int totalPages;
	private GetDelayedSupport support;
}