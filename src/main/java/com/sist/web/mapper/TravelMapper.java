package com.sist.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.sist.web.vo.TravelVO;

@Mapper
@Repository
public interface TravelMapper {
	@Select("SELECT no,title,image1,address,contentType,rownum FROM (SELECT no,title,image1,address,contentType FROM ${table_name} ORDER BY DBMS_RANDOM.VALUE) WHERE ROWNUM <=8")
	public List<TravelVO> travelRandomData(String table_name);
}
