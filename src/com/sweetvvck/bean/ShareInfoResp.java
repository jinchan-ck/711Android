package com.sweetvvck.bean;

import java.util.List;

/**
 * @author 科
 * {
    "pic" : "",
    "user" : undefined,
    "title" : "",
    "timestamp" : 1398623116941,
    "type" : "file",
    "sourceId" : "./uploads/Uninstall.exe",
    "_id" : ObjectId("535d4b8c0000004c22000002")
   }
 */

public class ShareInfoResp {
	private String status;
	private List<ShareInfo> shareInfos;
	public List<ShareInfo> getShareInfos() {
		return shareInfos;
	}
	public void setShareInfos(List<ShareInfo> shareInfos) {
		this.shareInfos = shareInfos;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ShareInfoResp [status=" + status + ", shareInfos=" + shareInfos
				+ "]";
	}
}
