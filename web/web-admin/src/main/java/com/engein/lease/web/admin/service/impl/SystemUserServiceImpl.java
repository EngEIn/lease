package com.engein.lease.web.admin.service.impl;

import com.engein.lease.model.entity.SystemUser;
import com.engein.lease.web.admin.mapper.SystemUserMapper;
import com.engein.lease.web.admin.service.SystemUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author engein
 * @description 针对表【system_user(员工信息表)】的数据库操作Service实现
 * @createDate 2024-08-10 15:48:00
 */
@Service
public class SystemUserServiceImpl extends ServiceImpl<SystemUserMapper, SystemUser>
        implements SystemUserService {

}




