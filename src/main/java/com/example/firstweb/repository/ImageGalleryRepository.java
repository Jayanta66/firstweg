package com.example.firstweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.firstweb.bean.ImageGallery;




@Repository
public interface ImageGalleryRepository extends JpaRepository<ImageGallery, Long>{

}

