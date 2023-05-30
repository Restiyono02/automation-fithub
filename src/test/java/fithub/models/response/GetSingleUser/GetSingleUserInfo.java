package fithub.models.response.GetSingleUser;

import lombok.Data;

@Data
public class GetSingleUserInfo {
	private String schema;
	private String name;
	private String exporterId;
	private String postmanId;
}