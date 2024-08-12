package com.engein.lease.web.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.engein.lease.model.entity.FeeKey;
import com.engein.lease.web.admin.vo.fee.FeeKeyVo;

import java.util.List;

/**
* @author engein
* @description 针对表【fee_key(杂项费用名称表)】的数据库操作Service
* @createDate 2024-08-10 15:48:00
*/
public interface FeeKeyService extends IService<FeeKey> {

    List<FeeKeyVo> listFeeInfo();
}
