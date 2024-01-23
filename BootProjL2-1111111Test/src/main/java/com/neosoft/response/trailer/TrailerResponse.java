package com.neosoft.response.trailer;

import java.util.List;

public class TrailerResponse {

	private List<BaseResponseForTrailer> data;
	private BasePageResponse page;
	public List<BaseResponseForTrailer> getData() {
		return data;
	}
	public void setData(List<BaseResponseForTrailer> data) {
		this.data = data;
	}
	public BasePageResponse getPage() {
		return page;
	}
	public void setPage(BasePageResponse page) {
		this.page = page;
	}
	
}
