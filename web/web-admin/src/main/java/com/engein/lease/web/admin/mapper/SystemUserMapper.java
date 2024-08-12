package com.engein.lease.web.admin.mapper;

import com.engein.lease.model.entity.SystemUser;
import com.engein.lease.web.admin.vo.system.user.SystemUserItemVo;
import com.engein.lease.web.admin.vo.system.user.SystemUserQueryVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Mapper;

/**
* @author engein
* @description 针对表【system_user(员工信息表)】的数据库操作Mapper
* @createDate 2024-08-10 15:48:00
* @Entity com.engein.lease.model.SystemUser
*/
public interface SystemUserMapper extends BaseMapper<SystemUser> {

    IPage<SystemUserItemVo> pageSystemUserByQuery(IPage<SystemUser> page, SystemUserQueryVo queryVo);

    SystemUser selectOneByUsername(String username);
}




