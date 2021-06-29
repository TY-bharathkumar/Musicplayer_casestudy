package com.te.musicproject.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@XmlRootElement(name ="music")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MusicPlayer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer Song_ID;
	@Column
	private String Song_Title;
	@Column
	private String Artist_Name;
	@Column
	private String Song_Location;
	@Column
	private String Description;
	public Integer getSong_ID() {
		return Song_ID;
	}
	public void setSong_ID(Integer song_ID) {
		Song_ID = song_ID;
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
