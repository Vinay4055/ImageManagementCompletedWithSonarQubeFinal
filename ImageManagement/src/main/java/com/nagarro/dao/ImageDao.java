package com.nagarro.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.model.Image;

@Repository
public interface ImageDao extends JpaRepository<Image,Integer>{ //Not of Use currently
	public List<Image> findImage(int userId);
	public void updateImageSource(byte[] image,int id);
	public float findTotalSizeOfImage(int userId);
}
