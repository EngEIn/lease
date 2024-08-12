package com.engein.lease.web.admin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.engein.lease.model.entity.LeaseAgreement;
import com.engein.lease.web.admin.vo.agreement.AgreementQueryVo;
import com.engein.lease.web.admin.vo.agreement.AgreementVo;

/**
* @author engein
* @description 针对表【lease_agreement(租约信息表)】的数据库操作Service
* @createDate 2024-08-10 15:48:00
*/
public interface LeaseAgreementService extends IService<LeaseAgreement> {

    IPage<AgreementVo> pageAgreementByQuery(IPage<AgreementVo> page, AgreementQueryVo queryVo);

    AgreementVo getAgreementById(Long id);
}
