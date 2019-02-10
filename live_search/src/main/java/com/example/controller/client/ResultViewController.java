package com.example.controller.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.serviceImpl.AreaServiceImpl;
import com.example.dao.serviceImpl.LiveServiceImpl;
import com.example.dao.serviceImpl.PlaceServiceImpl;
import com.example.dto.AreaEntity;
import com.example.dto.LiveEntity;
import com.example.form.LiveSearchForm;

/**
 * 検索結果表示用コントローラー
 * @author shaw
 *
 */
@Scope("prototype")
@Controller
@RequestMapping("/live")
public class ResultViewController {

	@Autowired
	private PlaceServiceImpl placeDao;

	@Autowired
	private AreaServiceImpl areaDao;

	@Autowired
	private LiveServiceImpl liveDao;

	@RequestMapping("/result")
	public String resutView(Model model, LiveSearchForm request) {
		try {
			// 開催日取得
			String liveDate = this.formatDataDate(request.getDate());
			// 場所取得
			String place = request.getPlace();

			// 場所情報取得
			AreaEntity areaDto = areaDao.findAreaEntity(place);

			if (Objects.isNull(areaDto)) {

			} else {
				// 場所、開催日からライブ情報を取得する
				ArrayList<LiveEntity> liveList = liveDao.findLiveList(liveDate, areaDto.getAreaNo());
			}




			return "searchForm";
		} catch (Exception ex) {
			// エラーログの出力
			ex.printStackTrace();
			// エラー画面の表示
			return "error";
		}
	}

	/**
	 * yyyy/M/d から yyyy-MM-dd に変換する
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	private String formatDataDate(String date) throws ParseException {
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/M/d");
		Date targetDate = sdFormat.parse(date);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-M-d");
		return format.format(targetDate);
	}

}
