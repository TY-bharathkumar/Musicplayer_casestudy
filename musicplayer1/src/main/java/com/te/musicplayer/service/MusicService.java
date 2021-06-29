package com.te.musicplayer.service;

import java.util.List;

import com.te.musicplayer.bean.MusicFiles;

public interface MusicService {
	public List<MusicFiles> playAllSong();
	public List<MusicFiles> randomSongs(int Song_Id);
	public List<MusicFiles> perticularSong(String song);
}
