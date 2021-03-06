package com.ipanel.join.protocol.sihua.cqvod.space;

import java.io.Serializable;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;




@Root(name="message")
public class SpaceTask implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6710101331121441782L;
	@Attribute(required=false)
	private String version;
	@Element(required=false)
	private SpaceHeader header;
	@Element(required=false)
	private TaskBody body;
	
	
	
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public SpaceHeader getHeader() {
		return header;
	}

	public void setHeader(SpaceHeader header) {
		this.header = header;
	}

	public TaskBody getBody() {
		return body;
	}

	public void setBody(TaskBody body) {
		this.body = body;
	}

	@Root(name="body",strict=false)
	public static class TaskBody implements Serializable{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = -5179391759242664143L;
		@Element
		private Tasks tasks;
		public Tasks getTasks() {
			return tasks;
		}
		public void setTasks(Tasks tasks) {
			this.tasks = tasks;
		}
		
	}
	
	@Root(name="tasks",strict=false)
	public static class Tasks implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = 4358462463263277390L;
		@Attribute(required=false)
		private String UUID;
		@Attribute(required=false)
		private String SPID;
		@Attribute(required=false)
		private String AppID;
		@Attribute(required=false)
		private String Type;
		@Attribute(required=false)
		private String Count;
		@Attribute(required=false)
		private String ResultCode;
		@Attribute(required=false)
		private String Description;
		@ElementList(inline=true,required=false)
		private List<TaskInfo> taskInfoList;
		
		public String getUUID() {
			return UUID;
		}
		public void setUUID(String uUID) {
			UUID = uUID;
		}
		public String getSPID() {
			return SPID;
		}
		public void setSPID(String sPID) {
			SPID = sPID;
		}
		public String getAppID() {
			return AppID;
		}
		public void setAppID(String appID) {
			AppID = appID;
		}
		public String getType() {
			return Type;
		}
		public void setType(String type) {
			Type = type;
		}
		public String getCount() {
			return Count;
		}
		public void setCount(String count) {
			Count = count;
		}
		public String getResultCode() {
			return ResultCode;
		}
		public void setResultCode(String resultCode) {
			ResultCode = resultCode;
		}
		public String getDescription() {
			return Description;
		}
		public void setDescription(String description) {
			Description = description;
		}
		public List<TaskInfo> getTaskInfoList() {
			return taskInfoList;
		}
		public void setTaskInfoList(List<TaskInfo> taskInfoList) {
			this.taskInfoList = taskInfoList;
		}
		
		
		
	}
	
}
