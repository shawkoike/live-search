package com.example.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * M_AREA のエンティティクラス
 * @author shaw
 *
 */
@Entity
@Table(name = "m_area")
public class AreaEntity {

	// エリア番号
	@Id
	@Column(name = "area_no")
	private Integer areaNo;

	// エリア名称
	@Column(name = "area_name")
	private String areaName;

	public Integer getAreaNo() {
		return areaNo;
	}

	public void setAreaNo(Integer areaNo) {
		this.areaNo = areaNo;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

}
