package com.engein.lease.web.admin.mapper;

import com.engein.lease.model.entity.LeaseAgreement;
import com.engein.lease.web.admin.vo.agreement.AgreementQueryVo;
import com.engein.lease.web.admin.vo.agreement.AgreementVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Mapper;

/**
* @author engein
* @description 针对表【lease_agreement(租约信息表)】的数据库操作Mapper
* @createDate 2024-08-10 15:48:00
* @Entity com.engein.lease.model.LeaseAgreement
*/
public interface LeaseAgreementMapper extends BaseMapper<LeaseAgreement> {

}




