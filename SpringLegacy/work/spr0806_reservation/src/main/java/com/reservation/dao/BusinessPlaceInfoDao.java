package com.reservation.dao;

import org.apache.ibatis.annotations.Param;

import com.reservation.dto.BusinessPlaceInfoDto;

public interface BusinessPlaceInfoDao {
	
	public BusinessPlaceInfoDto selectOneBusinessPlaceInfo(@Param("email") String email, @Param("business_regi_num") String business_regi_num) throws Exception;
	
	public void insertMyBusinessPlaceInfo(BusinessPlaceInfoDto dto) throws Exception;
	
	
	
	
	
	
	
	
	public BusinessPlaceInfoDto selectVendorBusinessPlaceInfo(String email, String business_regi_num) throws Exception;

	public BusinessPlaceInfoDto selectVendorBusinessPlaceInfo(BusinessPlaceInfoDto dto) throws Exception;
	
}
