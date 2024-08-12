package com.engein.lease.web.admin.mapper;

import com.engein.lease.model.entity.ApartmentInfo;
import com.engein.lease.model.enums.LeaseStatus;
import com.engein.lease.web.admin.vo.apartment.ApartmentItemVo;
import com.engein.lease.web.admin.vo.apartment.ApartmentQueryVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;

/**
* @author engein
* @description 针对表【apartment_info(公寓信息表)】的数据库操作Mapper
* @createDate 2024-08-10 15:48:00
* @Entity com.engein.lease.model.ApartmentInfo
*/
public interface ApartmentInfoMapper extends BaseMapper<ApartmentInfo> {

    IPage<ApartmentItemVo> pageApartmentItemByQuery(IPage<ApartmentItemVo> page, ApartmentQueryVo queryVo);
}




