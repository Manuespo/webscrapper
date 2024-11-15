package com.cursoSpringBoot.webscrapper.Repository;

import com.cursoSpringBoot.webscrapper.Models.Webpage;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WebpageRepository  extends CrudRepository<Webpage, Integer> {
    @Query("select w from Webpage w where w.domain like %:text% or w.title like %:text% or w.url like %:text% or w.description like %:text% order by w.rank desc ")
    List<Webpage> findByText(@Param("text") String text);
}
