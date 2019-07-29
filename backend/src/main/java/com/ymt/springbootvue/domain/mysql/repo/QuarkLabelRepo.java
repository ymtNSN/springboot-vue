package com.ymt.springbootvue.domain.mysql.repo;

import com.ymt.springbootvue.domain.mysql.entity.QuarkLabelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description TODO
 * @Author ymtNSN
 * @Date 2019/7/29
 */
public interface QuarkLabelRepo extends JpaRepository<QuarkLabelEntity,Integer> {
}
