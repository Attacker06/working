package com.kai.working.repository;

import com.kai.working.entity.Works;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepository extends JpaRepository<Works,Integer> {
}
