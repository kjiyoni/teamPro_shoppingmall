package getbag.shopping.web.mvc.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 세부 컨트롤러 명세(역할)
 * @author 홍재헌
 */
public interface HttpController {
	public String process(Map<String, String> paramMap, Map<String, Object> model, HttpServletRequest request, HttpServletResponse response);
}


