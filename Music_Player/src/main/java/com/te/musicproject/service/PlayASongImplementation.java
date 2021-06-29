package com.te.musicproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.musicproject.bean.MusicPlayer;
import com.te.musicproject.dao.MusicPlayerDao;

@Service
public class PlayASongImplementation implements  MusicService {
	@Autowired
	private MusicPlayerDao service;


	public List<MusicPlayer> getAll() {
		return service.findAll();
	}

	public MusicPlayer createORUpdateSong(MusicPlayer newSong) {
		return service.saveAndFlush(newSong);
	}

	public void deleteSong(Integer id) {
		service.deleteById(id);
	}
	public MusicPlayer findSong(Integer id) {
		return service.findById(id).get();
	}
}
