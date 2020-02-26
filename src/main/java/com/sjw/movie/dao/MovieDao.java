package com.sjw.movie.dao;

import java.util.List;

import com.sjw.movie.entity.Movie;
import com.sjw.movie.vo.MovieVO;

public interface MovieDao {

	List<Movie> list(MovieVO vo);

	int deleteAll(Integer[] ids);

	int xiajia(Integer id);

	int shangjia(Integer id);

}
