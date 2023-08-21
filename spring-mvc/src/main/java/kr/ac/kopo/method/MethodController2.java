package kr.ac.kopo.method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MethodController2 {
	// http://localhost:8080/spring-mvc/method/method
	@GetMapping(value = "/method/method")
	public String get() { // doGet()
		// view 의 이름을 리턴값으로 준다

		// WEB-INF/jsp/method/mthodForm.jsp
		return "/method/methodForm";
	}

	// http://localhost:8080/spring-mvc/method/method
	@PostMapping(value = "/method/method")
	public String post() {
		System.out.println("post 요청 받았아요");
		return "/method/methodProcess"; // view name return
		// WEB-INF/jsp/method/methodProcess.jsp
	}

}
