package com.engein.lease.web.admin.service;

import com.engein.lease.model.entity.SystemUser;
import com.engein.lease.web.admin.vo.system.user.SystemUserItemVo;
import com.engein.lease.web.admin.vo.system.user.SystemUserQueryVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author engein
* @description 针对表【system_user(员工信息表)】的数据库操作Service
* @createDate 2024-08-10 15:48:00
*/
public interface SystemUserService extends IService<SystemUser> {

    IPage<SystemUserItemVo> pageSystemUserByQuery(IPage<SystemUser> page, SystemUserQueryVo queryVo);

    SystemUserItemVo getSystemUserById(Long id);

}
