package com.engein.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.engein.lease.model.entity.CityInfo;
import com.engein.lease.web.admin.service.CityInfoService;
import com.engein.lease.web.admin.mapper.CityInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author engein
* @description 针对表【city_info】的数据库操作Service实现
* @createDate 2024-08-10 15:48:00
*/
@Service
public class CityInfoServiceImpl extends ServiceImpl<CityInfoMapper, CityInfo>
    implements CityInfoService{

}




