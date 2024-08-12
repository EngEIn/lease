package com.engein.lease.web.admin.mapper;

import com.engein.lease.model.entity.PaymentType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author engein
 * @description 针对表【payment_type(支付方式表)】的数据库操作Mapper
 * @createDate 2024-08-10 15:48:00
 * @Entity com.engein.lease.model.PaymentType
 */
public interface PaymentTypeMapper extends BaseMapper<PaymentType> {

    List<PaymentType> selectListByRoomId(Long id);
}




