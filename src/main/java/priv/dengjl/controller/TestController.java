package priv.dengjl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.z.order.api.IOrderOperateService;

@Controller
@RequestMapping("/my")
public class TestController {
	@Autowired
	private IOrderOperateService orderOperateService;
	
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		int orderId = orderOperateService.generateOrder("iphone 4s");
		mv.addObject("orderId", orderId);
		mv.setViewName("index");
		return mv;
	}
}
