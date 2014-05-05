package com.sweetvvck.bean;

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

public class ShareInfo {
	private String pic;
	private String user;
	private String title;
	private String timestamp;
	private String type;
	private String sourceId;
//	private String _id;
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSourceId() {
		return sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
//	public String get_id() {
//		return _id;
//	}
//	public void set_id(String _id) {
//		this._id = _id;
//	}
	@Override
	public String toString() {
		return "ShareInfo [pic=" + pic + ", user=" + user + ", title=" + title
				+ ", timeStamp=" + timestamp + ", type=" + type + ", sourceId="
				+ sourceId + "]";
	}
}
