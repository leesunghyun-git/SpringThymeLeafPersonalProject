package com.sist.web.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sist.web.service.TravelService;
import com.sist.web.vo.TravelVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {
	private final TravelService tService;
	@GetMapping("/")
	public String main_home(Model model)
	{
		List<TravelVO> sList = tService.travelRandomData("seoulTravel");
		List<TravelVO> bList = tService.travelRandomData("busanTravel");
		List<TravelVO> gList = tService.travelRandomData("gyeongjuTravel");
		List<TravelVO> jList = tService.travelRandomData("jejuTravel");
		model.addAttribute("sList", sList);
		model.addAttribute("bList", bList);
		model.addAttribute("gList", gList);
		model.addAttribute("jList", jList);
		model.addAttribute("curCat", "home");
		model.addAttribute("main_html", "main/home");
		return "main/main";
	}
}
