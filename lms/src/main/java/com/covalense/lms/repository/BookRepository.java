package com.covalense.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.covalense.lms.dto.BookInfoBean;

public interface BookRepository extends CrudRepository<BookInfoBean, Integer>{

	@Query("Select b from BookInfoBean b where b.bookName=:bName")
	 List<BookInfoBean> findByBookName(@Param("bName") BookInfoBean bName);
}
