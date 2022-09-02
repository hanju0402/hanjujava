package kr.co.greenart;


import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// "/print" GET 요청 -> text 입력 가능 form으로 foward
// form.jsp submit시 "/print" POST 요청 -> 입력한 text 그대로를 볼 수 있는 (view)print.jsp로 forward

@Controller
@RequestMapping(value = "/print")
public class PrintController {
	
	@GetMapping
	public String req() {
		
		
		return "form";
	}
	
//	@PostMapping
//	public String req2(HttpServletRequest req, Model model) {
//		
//		String a = req.getParameter("hanjoo");
//		System.out.println(a);
//		model.addAttribute("result", a);
//		return "print";
//	}
	
	// @RequestParam의 파람 String 변수명 은 인풋텍스트 name이랑 똑같이 해야함 
	@PostMapping
	public String req2(@RequestParam String hanjoo, Model model) {

		model.addAttribute("result", hanjoo);
		return "print";
	}
	
	//@ResponseBody 뷰이름 리턴 x 문자내용을 응답 body로서 보냄
	@GetMapping("/sub")
	public @ResponseBody String sub() {
		return "/print/sub";
	}

}
