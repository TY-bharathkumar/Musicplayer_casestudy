package com.te.musicplayer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.te.musicplayer.bean.MusicFiles;
import com.te.musicplayer.service.MusicService;
@RestController
public class PlayASong {
	@Autowired
	MusicService musicService;
	@GetMapping(path="/playall" ,produces={MediaType.APPLICATION_JSON_VALUE})
	public List<MusicFiles> playAllSongs( ){
		List<MusicFiles> files=musicService.playAllSong();
		return files;
	}
	@GetMapping(path="/getsong/{song_id}",produces={MediaType.APPLICATION_JSON_VALUE})
	public List<MusicFiles> randomSongs(@PathVariable int Song_Id){
		List<MusicFiles> files=musicService.randomSongs( Song_Id);
		
		return files;
	}

	@GetMapping(path="/perticularSong{Song_Title}",produces={MediaType.APPLICATION_JSON_VALUE})
	public List<MusicFiles> perticularSong(String Song_Title){
		List<MusicFiles> files=musicService.perticularSong(Song_Title);

		return files;
	}
	
}
