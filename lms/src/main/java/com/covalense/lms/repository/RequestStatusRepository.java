package com.covalense.lms.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.covalense.lms.dto.RequestStatusBean;

public interface RequestStatusRepository extends CrudRepository<RequestStatusBean, Integer>{

	@Query("Select r from RequestStatusBean r where r.requestStatus=:requestStatus")
	List<RequestStatusBean> findByReqStatus(@Param("requestStatus") String requestStatus);
}