package fithub.models.response.GetSingleUser;

import java.util.List;
import lombok.Data;

@Data
public class GetSingleUserResponse{
	private List<GetSingleUserItemItem> item;
	private GetSingleUserInfo info;
}