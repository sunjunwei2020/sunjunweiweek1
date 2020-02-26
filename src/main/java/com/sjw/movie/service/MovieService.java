package com.sjw.movie.service;

import java.util.List;

import com.sjw.movie.entity.Movie;
import com.sjw.movie.vo.MovieVO;

public interface MovieService {

	List<Movie> list(MovieVO vo);

	boolean deleteAll(Integer[] ids);

	boolean xiajia(Integer id);

	boolean shangjia(Integer id);

}
