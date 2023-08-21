package kr.ac.kopo.method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/method/method")
//@Controller
public class MethodController {
	// http://localhost:8080/spring-mvc/method/method
	@RequestMapping(value = "/method/method", method = RequestMethod.GET)
	public String get() { // doGet()
		// view 의 이름을 리턴값으로 준다

		// WEB-INF/jsp/method/mthodForm.jsp
		return "/method/methodForm";
	}

	@RequestMapping(value = "method/method", method = RequestMethod.POST)
	public String post() {
		System.out.println("post 요청 받았아요");
		return "/method/methodProcess"; // view name return
		// WEB-INF/jsp/method/methodProcess.jsp
	}

}
