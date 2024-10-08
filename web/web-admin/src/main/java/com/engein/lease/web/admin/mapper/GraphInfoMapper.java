package com.engein.lease.web.admin.mapper;

import com.engein.lease.model.entity.GraphInfo;
import com.engein.lease.model.enums.ItemType;
import com.engein.lease.web.admin.vo.graph.GraphVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author engein
* @description 针对表【graph_info(图片信息表)】的数据库操作Mapper
* @createDate 2024-08-10 15:48:00
* @Entity com.engein.lease.model.GraphInfo
*/
public interface GraphInfoMapper extends BaseMapper<GraphInfo> {

    List<GraphVo> selectListByItemTypeAndId(ItemType itemType, Long id);
}




