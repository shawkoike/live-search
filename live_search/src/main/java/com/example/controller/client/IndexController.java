package com.example.controller.client;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.serviceImpl.LiveServiceImpl;
import com.example.dao.serviceImpl.PlaceServiceImpl;
import com.example.dto.LiveEntity;
import com.example.dto.PlaceEntity;
import com.example.object.live.NewLiveInfoMapper;

/**
 * トップ画面用コントローラー
 * @author shaw
 *
 */
@Scope("prototype")
@Controller
public class IndexController {

	// イベント情報 Dao
	@Autowired
	private LiveServiceImpl liveDao;

	// ライブハウス情報
	@Autowired
	private PlaceServiceImpl placeDao;


	@RequestMapping("/home")
	public String home(Model model) {
		try {
			// 新着情報に表示するイベント情報を取得
			List<LiveEntity> newInfoList = liveDao.findNewInfo();
			// 取得できた情報数で振り分け
			if(Objects.isNull(newInfoList) || newInfoList.isEmpty()) {
				return "indexNoNewInfo";
			} else {
				for (int index=0; index < newInfoList.size(); index++) {
					// 新着情報に変換する
					NewLiveInfoMapper newInfo = this.convertToNewLineInfo(newInfoList.get(index));
					// Thymeleaf にオブジェクトを渡す
					model.addAttribute("live" + String.valueOf(index+1) , newInfo);
				}
			}

			if (newInfoList.size() == 1) {
				return "indexOneNewInfo";
			} else if (newInfoList.size() == 2) {
				return "indexTwoNewInfo";
			} else if (newInfoList.size() == 3) {
				return "indexThreeNewInfo";
			} else if (newInfoList.size() == 4){
				return "indexFourNewInfo";
			} else {
				return "indexNoNewInfo";
			}
		} catch (Exception ex) {
			// エラーログの出力
			ex.printStackTrace();
			// エラー画面の表示
			return "error";
		}
	}

	/**
	 * NewLiveInfo に変換する
	 * @param liveEntity : ライブ情報
	 * @return
	 */
	private NewLiveInfoMapper convertToNewLineInfo(LiveEntity liveEntity) {

		// 結果用変数
		NewLiveInfoMapper result = new NewLiveInfoMapper();
		result.setTitle(liveEntity.getDispName());
		result.setWhen(this.formatDate(liveEntity.getLiveDateTime()));
		result.setWhere(this.getPlace(liveEntity.getLivePlace()));
		result.setContent(liveEntity.getContent());
		result.setSequence(String.valueOf(liveEntity.getLiveNo()));

		return result;
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

	/**
	 * ライブハウス番号からライブハウス名を取得する
	 * @param placeNo
	 * @return
	 */
	private String getPlace(int placeNo) {
		PlaceEntity place = placeDao.getPlaceName(placeNo);
		return place.getPlaceName();
	}

}
