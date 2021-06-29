package com.te.musicproject.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.musicproject.bean.MusicPlayer;
import com.te.musicproject.bean.Responce;
import com.te.musicproject.service.MusicService;
import com.te.musicproject.service.PlayASongImplementation;

@RestController
public class PlayASong {
	@Autowired
	private PlayASongImplementation musicService;

		@GetMapping(path = "/search_a_song/{Song_ID}", produces = MediaType.APPLICATION_JSON_VALUE)
		public Responce Search_a_Song(@PathVariable Integer Song_ID) {
			Responce response = new Responce();
			MusicPlayer mp = musicService.findSong(Song_ID);
			response.setStatusCode(200);
			response.setMessage("Data Found");
			response.setData(mp);
			return response;
		}

	
		@GetMapping(path = "show_all_songs", produces = MediaType.APPLICATION_JSON_VALUE)
		public Responce Show_all_Songs() {
			Responce response = new Responce();
			List<MusicPlayer> allMusic = musicService.getAll();
			if (allMusic.isEmpty()) {
				response.setStatusCode(404);
				response.setMessage("no data found");
			} else {
				response.setStatusCode(200);
				response.setMessage("data found");
				response.setData(allMusic);
			}
			return response;
		}

	
		@GetMapping(path = "random_Song", produces = MediaType.APPLICATION_JSON_VALUE)
		public Responce random_Song() {
			Responce response = new Responce();
			MusicPlayer allMusic = musicService.findSong(20);
			response.setStatusCode(200);
			response.setMessage("data found");
			response.setData(allMusic);
			return response;
		}

	
		@PostMapping(path = "operate/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
		public Responce createMusic(@RequestBody MusicPlayer newMusic) {
			Responce response = new Responce();
			MusicPlayer musicVar = musicService.createORUpdateSong(newMusic);
			if (musicVar.equals(null)) {
				response.setStatusCode(404);
				response.setMessage("could not save song");
			} else {
				response.setStatusCode(200);
				response.setMessage("Sussessfully added");
				response.setData(musicVar);
			}
			return response;
		}

	
		@PutMapping(path = "/operate/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
		public Responce updateMusic(@RequestBody MusicPlayer updatedMusic) {
			Responce response = new Responce();
			MusicPlayer updSong = musicService.createORUpdateSong(updatedMusic);
			if (updSong.equals(null)) {
				response.setStatusCode(404);
				response.setMessage("could not upadate song");
			} else {
				response.setStatusCode(200);
				response.setMessage("Sussessfully updated");
				response.setData(updSong);
			}
			return response;
		}

	
		@DeleteMapping(path = "/operate/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
		public Responce deleteMusic(@PathVariable Integer id) {
			Responce response = new Responce();
			musicService.deleteSong(id);
			response = Search_a_Song(id);
			if (response.getStatusCode() == 404) {
				response.setStatusCode(200);
				response.setMessage("Sussessfully deleted");
			} else {
				response.setStatusCode(404);
				response.setMessage("could not delete song");
			}
			return response;
		}

}
