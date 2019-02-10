package com.example.dao.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.dto.LiveEntity;

/**
 * イベント情報レポジトリクラス
 * @author shaw
 *
 */
@Repository
public interface LiveRepository extends JpaRepository<LiveEntity, Integer> {

	@Query(value = "SELECT * FROM M_LIVE WHERE current_date >= disp_start_datetime AND current_date <= disp_end_datetime ORDER BY live_no limit 4", nativeQuery = true)
	public List<LiveEntity> getNewInfo();

	@Query(value = "SELECT * FROM M_LIVE WHERE current_date >= disp_start_datetime AND current_date <= disp_end_datetime AND area_type = :areaNo AND live_datetime = :liveDate ORDER BY live_no", nativeQuery = true)
	public ArrayList<LiveEntity> getLiveInfoList(@Param("liveDate")String liveDate, @Param("areaNo")Integer areaNo);

}
