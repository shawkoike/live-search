package com.example.object.live;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.dto.LiveEntity;

/**
 * Home 画面用LIVEオブジェクト
 * @author shaw
 *
 */
public class NewLiveInfoMapper {

	// タイトル
	private String title;

	// 日時
	private String when;

	// 場所
	private String where;

	// 詳細
	private String content;

	// シーケンス
	private String sequence;

	// コンストラクタ
	public NewLiveInfoMapper() {}

	// コンストラクタ
	public NewLiveInfoMapper(LiveEntity liveEntity) {
		this.title = liveEntity.getDispName();
		this.when = this.formatDate(liveEntity.getLiveDateTime());
	}

	/**
	 * 日付型を表示用にフォーマットする
	 * @param date
	 * @return
	 */
	private String formatDate(Date date) {
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy年M月d日");
		return sdFormat.format(date);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWhen() {
		return when;
	}

	public void setWhen(String when) {
		this.when = when;
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

}
