package com.springboot.repository;

import com.springboot.entity.WikimediaDTO;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WikimediaDataRepository extends JpaRepository<WikimediaDTO, Long> {
}
