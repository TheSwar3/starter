package com.cory.starter.integration.mysql.repository;
import com.cory.starter.integration.mysql.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends JpaRepository<Content, Long>{


}
