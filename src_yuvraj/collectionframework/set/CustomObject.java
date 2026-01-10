package collectionframework.set;

import java.util.Objects;

public class CustomObject {

	private int serialNo;
	private String topicName;

	public CustomObject() {
		System.out.println("this is zero argument constructor");
	}

	public CustomObject(int serialNo, String topicName) {
		this.serialNo = serialNo;
		this.topicName = topicName;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	@Override
	public String toString() {
		return "Custom object [ Serial No. = " + serialNo + ", Topic Name = " + topicName + " ]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true; // same reference
		if (obj == null)
			return false; // null check
		if (getClass() != obj.getClass())
			return false;
		CustomObject c = (CustomObject) obj;
		return this.serialNo == c.serialNo;
	}

	@Override
	public int hashCode() {
		 return Integer.hashCode(serialNo);
	}

}
