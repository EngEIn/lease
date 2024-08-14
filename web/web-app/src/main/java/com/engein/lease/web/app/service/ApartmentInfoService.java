package com.engein.lease.web.app.service;

import com.engein.lease.model.entity.ApartmentInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.engein.lease.web.app.vo.apartment.ApartmentItemVo;

/**
 * @author engein
 * @description 针对表【apartment_info(公寓信息表)】的数据库操作Service
 * @createDate 2023-07-26 11:12:39
 */
public interface ApartmentInfoService extends IService<ApartmentInfo> {

    ApartmentItemVo selectApartmentItemVoById(Long id);

}
