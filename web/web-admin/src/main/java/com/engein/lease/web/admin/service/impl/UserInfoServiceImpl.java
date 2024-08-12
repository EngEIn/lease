package com.engein.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.engein.lease.model.entity.UserInfo;
import com.engein.lease.web.admin.service.UserInfoService;
import com.engein.lease.web.admin.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author engein
* @description 针对表【user_info(用户信息表)】的数据库操作Service实现
* @createDate 2024-08-10 15:48:00
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService{

}




