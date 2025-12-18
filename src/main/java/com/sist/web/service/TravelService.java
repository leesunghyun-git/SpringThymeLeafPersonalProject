package com.sist.web.service;

import java.util.List;

import com.sist.web.vo.TravelVO;

public interface TravelService {
	public List<TravelVO> travelRandomData(String table_name);
}
