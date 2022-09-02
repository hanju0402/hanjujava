package kr.co.greenart;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mapping")
public class MappingController {
	
	// 아무 두글자한뒤 .two
	@GetMapping(value = "/??.two", produces = "text/plain; charset=utf-8")
	public @ResponseBody String two() {
		return "두글자 매핑";
	}
	
	// 아무거나 적은뒤 .do
	@GetMapping("/*.do")
	public @ResponseBody String doURI() {
		return "do로 끝나는 매핑";
	}
	
	// params = "com" 이란뜻은 com이란 파라미터가 필수로 있어야한다는 뜻
	// params = "com = val" 이란뜻은 com이란 파라미터가 필수로있고 그 값도 val이어야한다는 뜻
	@GetMapping(value = "/ppp", params = "com")
	public @ResponseBody String ppp(@RequestParam(defaultValue = "default") String com) {
		return "ppp";
	}
	
//	@GetMapping(value = "/ppp", params = "!com")
//	public @ResponseBody String ppp2(@RequestParam(defaultValue = "default") String com) {
//		return com;
//	}
		
	
}
