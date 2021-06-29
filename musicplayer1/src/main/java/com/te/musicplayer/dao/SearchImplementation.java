package com.te.musicplayer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.te.musicplayer.bean.MusicFiles;

public class SearchImplementation implements SearchASong {
@Autowired
EntityManagerFactory factory=null;

@Override
public List<MusicFiles> search(Object Song) {
	List<MusicFiles> list=null;
	try {
		EntityManager manager =factory.createEntityManager();
		Query query=manager.createQuery("from MusicFiles where Song_Title=:Song");
		query.setParameter("Song_Title", Song);
		list =query.getResultList();
	} catch (Exception e) {
		e.printStackTrace();
	}

	return list;
}




}
