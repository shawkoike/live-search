package com.example.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * M_LIVE のエンティティクラス
 * @author shaw
 *
 */
@Entity
@Table(name = "m_live")
public class LiveEntity {

	// シーケンス
	@Id
	@GeneratedValue
	@Column(name = "live_no")
	private int liveNo;

	// イベント名
	@Column(name = "live_name")
	private String liveName;

	// 表示名
	@Column(name = "disp_name")
	private String dispName;

	// イベント日程
	@Column(name = "live_datetime")
	private Date liveDateTime;

	// 表示開始日時
	@Column(name = "disp_start_datetime")
	private Date dispStartDate;

	// 表示終了日時
	@Column(name = "disp_end_datetime")
	private Date dispEndDateTime;

	// ライブハウス
	@Column(name = "live_place")
	private int livePlace;

	// エリアタイプ
	@Column(name = "area_type")
	private int areaType;

	// 金額
	@Column(name = "price")
	private int price;

	// 詳細
	@Column(name = "live_info")
	private String content;

	// 連絡先
	@Column(name = "contact")
	private String contact;

	public int getLiveNo() {
		return liveNo;
	}

	public void setLiveNo(int liveNo) {
		this.liveNo = liveNo;
	}

	public String getLiveName() {
		return liveName;
	}

	public void setLiveName(String liveName) {
		this.liveName = liveName;
	}

	public String getDispName() {
		return dispName;
	}

	public void setDispName(String dispName) {
		this.dispName = dispName;
	}

	public Date getLiveDateTime() {
		return liveDateTime;
	}

	public void setLiveDateTime(Date liveDateTime) {
		this.liveDateTime = liveDateTime;
	}

	public Date getDispStartDate() {
		return dispStartDate;
	}

	public void setDispStartDate(Date dispStartDate) {
		this.dispStartDate = dispStartDate;
	}

	public Date getDispEndDateTime() {
		return dispEndDateTime;
	}

	public void setDispEndDateTime(Date dispEndDateTime) {
		this.dispEndDateTime = dispEndDateTime;
	}

	public int getLivePlace() {
		return livePlace;
	}

	public void setLivePlace(int livePlace) {
		this.livePlace = livePlace;
	}

	public int getAreaType() {
		return areaType;
	}

	public void setAreaType(int areaType) {
		this.areaType = areaType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

}
