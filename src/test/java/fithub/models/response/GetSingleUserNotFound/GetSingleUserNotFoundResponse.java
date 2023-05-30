package fithub.models.response.GetSingleUserNotFound;

import java.util.List;
import lombok.Data;

@Data
public class GetSingleUserNotFoundResponse{
	private List<GetSingleUserNotFoundItemItem> item;
	private GetSingleUserNotFoundInfo info;
}