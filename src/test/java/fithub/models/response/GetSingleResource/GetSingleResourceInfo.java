package fithub.models.response.GetSingleResource;

import lombok.Data;

@Data
public class GetSingleResourceInfo {
	private String schema;
	private String name;
	private String exporterId;
	private String postmanId;
}