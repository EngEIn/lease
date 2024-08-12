package com.engein.lease.web.admin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.engein.lease.model.entity.ApartmentInfo;
import com.engein.lease.web.admin.vo.apartment.ApartmentDetailVo;
import com.engein.lease.web.admin.vo.apartment.ApartmentItemVo;
import com.engein.lease.web.admin.vo.apartment.ApartmentQueryVo;
import com.engein.lease.web.admin.vo.apartment.ApartmentSubmitVo;

/**
* @author engein
* @description 针对表【apartment_info(公寓信息表)】的数据库操作Service
* @createDate 2024-08-10 15:48:00
*/
public interface ApartmentInfoService extends IService<ApartmentInfo> {

    void saveOrUpdateApartment(ApartmentSubmitVo apartmentSubmitVo);

    IPage<ApartmentItemVo> pageApartmentItemByQuery(IPage<ApartmentItemVo> page, ApartmentQueryVo queryVo);

    ApartmentDetailVo getApartmentDetailById(Long id);

    void removeApartmentById(Long id);
}
