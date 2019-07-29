package com.ymt.springbootvue.domain.server;

import com.ymt.springbootvue.domain.mysql.entity.QuarkLabelEntity;
import com.ymt.springbootvue.domain.mysql.entity.QuarkRoleEntity;
import com.ymt.springbootvue.domain.mysql.repo.QuarkLabelRepo;
import com.ymt.springbootvue.domain.mysql.repo.QuarkRoleRepo;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description TODO
 * @Author ymtNSN
 * @Date 2019/7/29
 */
@Service
public class QuarkService {

    @Autowired
    private QuarkLabelRepo quarkLabelRepo;
    @Autowired
    private QuarkRoleRepo quarkRoleRepo;

    //    @Transactional(rollbackFor = Exception.class)
    public void createQuarkLable() {
//        ((QuarkService) AopContext.currentProxy()).createQuarkRole();
        createQuarkRole();
    }

    @Transactional(rollbackFor = Exception.class)
    public void createQuarkRole() {
        QuarkLabelEntity quarkLabelEntity = new QuarkLabelEntity();
        quarkLabelEntity.setDetails("关于Translaction4");
        quarkLabelEntity.setName("python4");
        quarkLabelEntity.setPostsCount(124);
        quarkLabelRepo.saveAndFlush(quarkLabelEntity);
        System.out.println(2 / 0);
        QuarkRoleEntity quarkRoleEntity = new QuarkRoleEntity();
        quarkRoleEntity.setDescription("测试4");
        quarkRoleEntity.setName("测试4");
        quarkRoleRepo.saveAndFlush(quarkRoleEntity);
    }
}
