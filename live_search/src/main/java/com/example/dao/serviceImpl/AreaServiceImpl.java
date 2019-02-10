package com.example.dao.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.repository.AreaRepository;
import com.example.dao.service.AreaService;
import com.example.dto.AreaEntity;

/**
 * M_AREA のサービスクラス
 * @author shaw
 *
 */
@Service
public class AreaServiceImpl implements AreaService {

	@Autowired
	private AreaRepository areaRepository;

	public AreaEntity findAreaEntity(String placeName) {
		return areaRepository.findAreaEntity(placeName);
	}


}
