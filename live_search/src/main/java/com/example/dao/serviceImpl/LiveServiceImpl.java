package com.example.dao.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.repository.LiveRepository;
import com.example.dao.service.LiveService;
import com.example.dto.LiveEntity;

/**
 * M_LIVE のサービスクラス
 * @author shaw
 *
 */
@Service
public class LiveServiceImpl implements LiveService {

	@Autowired
	private LiveRepository liveRepository;

	/**
	 * Home に表示する新着情報を取得する
	 * @return
	 */
	public List<LiveEntity> findNewInfo() {
		return liveRepository.getNewInfo();
	}

	/**
	 * 開催日に関わるライブ情報を取得する
	 * @param liveDate
	 * @param areaNo
	 * @return
	 */
	public ArrayList<LiveEntity> findLiveList(String liveDate, Integer areaNo) {
		return liveRepository.getLiveInfoList(liveDate, areaNo);
	}

}
