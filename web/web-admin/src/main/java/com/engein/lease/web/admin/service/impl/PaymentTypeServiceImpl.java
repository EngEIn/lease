package com.engein.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.engein.lease.model.entity.PaymentType;
import com.engein.lease.web.admin.service.PaymentTypeService;
import com.engein.lease.web.admin.mapper.PaymentTypeMapper;
import org.springframework.stereotype.Service;

/**
* @author engein
* @description 针对表【payment_type(支付方式表)】的数据库操作Service实现
* @createDate 2024-08-10 15:48:00
*/
@Service
public class PaymentTypeServiceImpl extends ServiceImpl<PaymentTypeMapper, PaymentType>
    implements PaymentTypeService{

}




