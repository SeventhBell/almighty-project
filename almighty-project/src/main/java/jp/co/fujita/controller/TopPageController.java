package jp.co.fujita.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * トップページのコントローラ
 * 表示関係のみ
 * @author 藤田
 */
@Controller
public class TopPageController {

	private final static Logger logger = LoggerFactory.getLogger(TopPageController.class);

	@RequestMapping(value = "/top", method = RequestMethod.GET)
	public ModelAndView topPage(Locale locale, Model model) {
		ModelAndView modelAndView = new ModelAndView("top");
		modelAndView.addObject("welcomeText", "Hallo");
		return modelAndView;
	}

}
