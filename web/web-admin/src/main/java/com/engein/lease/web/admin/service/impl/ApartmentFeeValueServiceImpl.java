package com.engein.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.engein.lease.model.entity.ApartmentFeeValue;
import com.engein.lease.web.admin.service.ApartmentFeeValueService;
import com.engein.lease.web.admin.mapper.ApartmentFeeValueMapper;
import org.springframework.stereotype.Service;

/**
* @author engein
* @description 针对表【apartment_fee_value(公寓&杂费关联表)】的数据库操作Service实现
* @createDate 2024-08-10 15:48:00
*/
@Service
public class ApartmentFeeValueServiceImpl extends ServiceImpl<ApartmentFeeValueMapper, ApartmentFeeValue>
    implements ApartmentFeeValueService{

}




