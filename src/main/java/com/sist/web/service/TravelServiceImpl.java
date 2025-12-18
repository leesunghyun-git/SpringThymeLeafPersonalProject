package com.sist.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sist.web.mapper.TravelMapper;
import com.sist.web.vo.TravelVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TravelServiceImpl implements TravelService{
	private final TravelMapper tMapper;
	@Override
		public List<TravelVO> travelRandomData(String table_name) {
			// TODO Auto-generated method stub
			return tMapper.travelRandomData(table_name);
		}
	
}
