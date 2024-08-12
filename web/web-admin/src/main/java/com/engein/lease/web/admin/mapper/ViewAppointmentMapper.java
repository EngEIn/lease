package com.engein.lease.web.admin.mapper;

import com.engein.lease.model.entity.ViewAppointment;
import com.engein.lease.web.admin.vo.appointment.AppointmentQueryVo;
import com.engein.lease.web.admin.vo.appointment.AppointmentVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Mapper;

/**
* @author engein
* @description 针对表【view_appointment(预约看房信息表)】的数据库操作Mapper
* @createDate 2024-08-10 15:48:00
* @Entity com.engein.lease.model.ViewAppointment
*/
public interface ViewAppointmentMapper extends BaseMapper<ViewAppointment> {

}




