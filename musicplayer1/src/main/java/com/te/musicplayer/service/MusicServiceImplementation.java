package com.te.musicplayer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.musicplayer.bean.MusicFiles;
import com.te.musicplayer.dao.PlayMusicDao;
@Service
public class MusicServiceImplementation implements MusicService {
	@Autowired
	PlayMusicDao dao;
	@Override
	public List<MusicFiles> playAllSong() {
		// TODO Auto-generated method stub
		return dao.playAllSong();
	}
	@Override
	public List<MusicFiles> randomSongs(int Song_Id) {
		// TODO Auto-generated method stub
		return dao.randomSongs(Song_Id);
	}
	@Override
	public List<MusicFiles> perticularSong(String song) {
		// TODO Auto-generated method stub
		return dao.perticularSong(song);
	}

}
