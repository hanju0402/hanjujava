package kr.co.greenart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestHandling {
	private final static Logger logger = LoggerFactory.getLogger(RequestHandling.class);
	
	@RequestMapping(value = "/req", method = RequestMethod.GET)
	public String req(@RequestParam() int param, @RequestParam int param2, Model model) {

		// http://localhost:8080/greenart/req?param=123&param2=222
		// param = 123 과 param2=222 를 int 화해서 가져온다
		// result = 345
		
		
		logger.info(String.valueOf(param + param2));
		// java에서 jsp로 값을 전송할땐 model 로 Attribute를 설정해서 넘길수있다.
		model.addAttribute("result", param + param2);
		
		return "plusresult";
	}

}
