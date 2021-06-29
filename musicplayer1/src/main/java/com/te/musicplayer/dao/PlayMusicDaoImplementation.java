package com.te.musicplayer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.musicplayer.bean.MusicFiles;
@Repository
public class PlayMusicDaoImplementation implements PlayMusicDao {
	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public List<MusicFiles> playAllSong() {
		List<MusicFiles> list=null;
		try {
			EntityManager manager=factory.createEntityManager();
			String playSong="from MusicFiles";
			Query playsongs=manager.createQuery(playSong);
			list=playsongs.getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	@Override
	public List<MusicFiles> randomSongs(int Song_Id) {
		List<MusicFiles> list=null;
		try {
			EntityManager manager =factory.createEntityManager();
			Query query2=manager.createQuery("from MusicFiles where Song_Id=:Song_Id");
			query2.setParameter("Song_Id", Song_Id);
			list=query2.getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	@Override
	public List<MusicFiles> perticularSong(String Song_Title) {
		List<MusicFiles> list=null;
		try {
			EntityManager manager =factory.createEntityManager();
			Query query=manager.createQuery("from MusicFiles where Song_Title=:Song_Title");
			query.setParameter("Song_Title", Song_Title);
			list =query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
