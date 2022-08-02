package com.learning.iplProject.gameapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.learning.iplProject.gameapi.entity.Players;
@Repository
public interface GameRepository extends JpaRepository<Players,Integer>{
	

}
