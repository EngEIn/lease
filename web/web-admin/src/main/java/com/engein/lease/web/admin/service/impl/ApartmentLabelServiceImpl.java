package com.engein.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.engein.lease.model.entity.ApartmentLabel;
import com.engein.lease.web.admin.service.ApartmentLabelService;
import com.engein.lease.web.admin.mapper.ApartmentLabelMapper;
import org.springframework.stereotype.Service;

/**
* @author engein
* @description 针对表【apartment_label(公寓标签关联表)】的数据库操作Service实现
* @createDate 2024-08-10 15:48:00
*/
@Service
public class ApartmentLabelServiceImpl extends ServiceImpl<ApartmentLabelMapper, ApartmentLabel>
    implements ApartmentLabelService{

}




