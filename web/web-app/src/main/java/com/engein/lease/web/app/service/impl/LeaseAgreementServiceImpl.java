package com.engein.lease.web.app.service.impl;

import com.engein.lease.model.entity.LeaseAgreement;
import com.engein.lease.web.app.mapper.LeaseAgreementMapper;
import com.engein.lease.web.app.service.LeaseAgreementService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author engein
 * @description 针对表【lease_agreement(租约信息表)】的数据库操作Service实现
 * @createDate 2023-07-26 11:12:39
 */
@Service
public class LeaseAgreementServiceImpl extends ServiceImpl<LeaseAgreementMapper, LeaseAgreement>
        implements LeaseAgreementService {

}




