package com.te.musicplayer.dao;

import java.util.List;

import com.te.musicplayer.bean.MusicFiles;

public interface PlayMusicDao {
	public List<MusicFiles> playAllSong();
	public List<MusicFiles> randomSongs(int Song_Id);
	public List<MusicFiles> perticularSong(String Song_Title);
}
