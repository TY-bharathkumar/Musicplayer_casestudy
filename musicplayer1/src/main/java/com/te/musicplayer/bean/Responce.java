package com.te.musicplayer.bean;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;


@JsonRootName("response")
@JsonPropertyOrder({"status" , "msg"})
@XmlRootElement(name = "response")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Responce implements Serializable{

	@JsonProperty("status")
	@XmlElement(name = "status-code")
	private int statusCode;


	private String  msg;

	@JsonProperty("employee_info")
	@XmlElement(name = "employee-info")
	private MusicFiles bean;


	private List<MusicFiles> files;


	public int getStatusCode() {
		return statusCode;
	}


	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public MusicFiles getBean() {
		return bean;
	}


	public List<MusicFiles> getFiles() {
		return files;
	}


	public void setFiles(List<MusicFiles> files) {
		this.files = files;
	}


	public void setBean(MusicFiles bean) {
		this.bean = bean;
	}


}