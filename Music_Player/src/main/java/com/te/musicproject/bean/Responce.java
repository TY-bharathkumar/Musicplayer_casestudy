package com.te.musicproject.bean;


import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;


@SuppressWarnings("serial")
@JsonRootName("response")
@JsonPropertyOrder({"status" , "msg"})
@XmlRootElement(name = "response")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Responce implements Serializable{

	@JsonProperty("status")
	@XmlElement(name = "status-code")
	private int statusCode;
	private String message;
	private Object data;

	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public Object getData() {
		return data;
	}


	public void setData(Object data) {
		this.data = data;
	}


	@JsonProperty("music")
	@XmlElement(name = "music")
	private MusicPlayer bean;


	private List<MusicPlayer> files;


	public int getStatusCode() {
		return statusCode;
	}


	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}




	public MusicPlayer getBean() {
		return bean;
	}


	public List<MusicPlayer> getFiles() {
		return files;
	}


	public void setFiles(List<MusicPlayer> files) {
		this.files = files;
	}


	public void setBean(MusicPlayer bean) {
		this.bean = bean;
	}


}