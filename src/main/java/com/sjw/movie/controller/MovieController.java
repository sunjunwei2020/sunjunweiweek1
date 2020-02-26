package com.sjw.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sjw.movie.entity.Movie;
import com.sjw.movie.service.MovieService;
import com.sjw.movie.vo.MovieVO;

@Controller
public class MovieController {

	@Autowired
	private MovieService service;
	
	@RequestMapping("list")
	public String list(Model m,MovieVO vo){
		
		if(vo.getPageNum()==null){
			vo.setPageNum(1);
		}
		
		PageHelper.startPage(vo.getPageNum(), 3);
		
		List<Movie> movie = service.list(vo);
		PageInfo<Movie> page = new PageInfo<>(movie);
		
		m.addAttribute("page",page);
		m.addAttribute("vo",vo);
		
		return "list";
	}
	
	@ResponseBody
	@RequestMapping("deleteAll")
	public Object deleteAll(Integer[] ids){
		
		boolean flag = service.deleteAll(ids);
		
		return flag;
	}
	//об╪э
	@ResponseBody
	@RequestMapping("xiajia")
	public Object xiajia(Integer id){
		
		boolean flag = service.xiajia(id);
		
		return flag;
	}
	//ио╪э
	@ResponseBody
	@RequestMapping("shangjia")
	public Object shangjia(Integer id){
		
		boolean flag = service.shangjia(id);
		
		return flag;
	}
}
