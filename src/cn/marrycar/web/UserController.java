package cn.marrycar.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping(value = "/login",produces = "text/plain;charset=utf-8")
	public @ResponseBody String list(){
        return "ÄãºÃ";
	}
}
