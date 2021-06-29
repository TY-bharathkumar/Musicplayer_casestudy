package com.te.musicplayer.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;


@Entity
@XmlRootElement(name ="employee-info")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MusicFiles implements Serializable{
	@Id
	@Column
	private  int Song_Id;
	@Column
	private  String Song_Title;
	@Column
	private String Artist_Name;
	@Column
	private String Song_Location;
	@Column
	private String Description;
	@Column
	public int getSong_Id() {
		return Song_Id;
	}
	public void setSong_Id(int song_Id) {
		Song_Id = song_Id;
	}
	public String getSong_Title() {
		return Song_Title;
	}
	public void setSong_Title(String song_Title) {
		Song_Title = song_Title;
	}
	public String getArtist_Name() {
		return Artist_Name;
	}
	public void setArtist_Name(String artist_Name) {
		Artist_Name = artist_Name;
	}
	public String getSong_Location() {
		return Song_Location;
	}
	public void setSong_Location(String song_Location) {
		Song_Location = song_Location;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}

}
