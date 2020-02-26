package com.sjw.movie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjw.movie.dao.MovieDao;
import com.sjw.movie.entity.Movie;
import com.sjw.movie.service.MovieService;
import com.sjw.movie.vo.MovieVO;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao dao;

	@Override
	public List<Movie> list(MovieVO vo) {
		
		return dao.list(vo);
	}

	@Override
	public boolean deleteAll(Integer[] ids) {
		
		int i = dao.deleteAll(ids);
		
		return i>0;
	}

	@Override
	public boolean xiajia(Integer id) {
		
		int i = dao.xiajia(id);
		
		return i>0;
	}

	@Override
	public boolean shangjia(Integer id) {
		
		int i = dao.shangjia(id);
		
		return i>0;
	}
	
	
}
