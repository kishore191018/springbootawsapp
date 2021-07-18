package com.tcs.aws.app;

public class DemoUser {

	private Integer cmpnyId;

	private String userId;

	private Integer lnggCd;

	private Integer prjctId;

	private Integer stkhldrId;

	private Integer offset;

	private Integer limit;

	public Integer getCmpnyId() {
		return cmpnyId;
	}

	public void setCmpnyId(Integer cmpnyId) {
		this.cmpnyId = cmpnyId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getLnggCd() {
		return lnggCd;
	}

	public void setLnggCd(Integer lnggCd) {
		this.lnggCd = lnggCd;
	}

	public Integer getPrjctId() {
		return prjctId;
	}

	public void setPrjctId(Integer prjctId) {
		this.prjctId = prjctId;
	}

	public Integer getStkhldrId() {
		return stkhldrId;
	}

	public void setStkhldrId(Integer stkhldrId) {
		this.stkhldrId = stkhldrId;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "DemoUser [cmpnyId=" + cmpnyId + ", userId=" + userId + ", lnggCd=" + lnggCd + ", prjctId=" + prjctId
				+ ", stkhldrId=" + stkhldrId + ", offset=" + offset + ", limit=" + limit + "]";
	}
}
