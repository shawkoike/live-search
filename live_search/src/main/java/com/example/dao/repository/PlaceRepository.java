package com.example.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.dto.PlaceEntity;

/**
 * ライブハウス情報レポジトリクラス
 * @author shaw
 *
 */
@Repository
public interface PlaceRepository extends JpaRepository<PlaceEntity, Integer>{

	@Query(value = "SELECT * FROM M_PLACE WHERE place_no = :placeNo limit 1;", nativeQuery = true)
	public PlaceEntity findPlace(@Param("placeNo")int placeNo);

}
