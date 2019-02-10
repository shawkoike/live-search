package com.example.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * M_PLACE のエンティティクラス
 * @author shaw
 *
 */
@Entity
@Table(name = "m_live")
public class PlaceEntity {

	// ライブハウス番号
	@Id
	@Column(name = "place_no")
	private Integer placeNo;

	// ライブハウス名
	@Column(name = "place_name")
	private String placeName;

	// エリアタイプ
	@Column(name = "area_type")
	private Integer areaType;

	public Integer getPlaceNo() {
		return placeNo;
	}

	public void setPlaceNo(Integer placeNo) {
		this.placeNo = placeNo;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public Integer getAreaType() {
		return areaType;
	}

	public void setAreaType(Integer areaType) {
		this.areaType = areaType;
	}

}
