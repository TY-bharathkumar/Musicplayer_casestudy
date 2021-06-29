package com.te.musicproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.musicproject.bean.MusicPlayer;

@Repository
public interface MusicPlayerDao extends JpaRepository<MusicPlayer, Integer> {

}
