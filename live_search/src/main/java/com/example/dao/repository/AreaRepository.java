package com.example.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.dto.AreaEntity;

/**
 * エリア情報レポジトリクラス
 * @author shaw
 *
 */
@Repository
public interface AreaRepository extends JpaRepository<AreaEntity, Integer> {

	@Query(value="SELECT * FROM M_AREA WHERE area_name = :areaName limit 1;", nativeQuery = true)
	public AreaEntity findAreaEntity(@Param("areaName") String areaName);

}
