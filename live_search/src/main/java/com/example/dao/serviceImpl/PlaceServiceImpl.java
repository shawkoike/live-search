package com.example.dao.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.repository.PlaceRepository;
import com.example.dao.service.PlaceService;
import com.example.dto.PlaceEntity;

/**
 * M_PLACE のサービスクラス
 * @author shaw
 *
 */
@Service
public class PlaceServiceImpl implements PlaceService {

	@Autowired
	private PlaceRepository placeRepository;

	public PlaceEntity getPlaceName(int placeNo) {
		return placeRepository.findPlace(placeNo);
	}

}
