package com.engein.lease.web.admin.mapper;

import com.engein.lease.model.entity.FeeKey;
import com.engein.lease.web.admin.vo.fee.FeeKeyVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author engein
* @description 针对表【fee_key(杂项费用名称表)】的数据库操作Mapper
* @createDate 2024-08-10 15:48:00
* @Entity com.engein.lease.model.FeeKey
*/
public interface FeeKeyMapper extends BaseMapper<FeeKey> {

    List<FeeKeyVo> listFeeInfo();

}




