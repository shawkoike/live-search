package com.example.controller.client;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 検索フォーム用コントローラー
 * @author shaw
 *
 */
@Scope("prototype")
@Controller
@RequestMapping("/live")
public class SearchFormController {

	@RequestMapping("/search")
	public String searchForm(Model model) {
		try {
			return "searchForm";
		} catch (Exception ex) {
			// エラーログの出力
			ex.printStackTrace();
			// エラー画面の表示
			return "error";
		}
	}

}
