package com.engein.lease.web.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.engein.lease.model.entity.AttrKey;
import com.engein.lease.web.admin.vo.attr.AttrKeyVo;

import java.util.List;

/**
* @author engein
* @description 针对表【attr_key(房间基本属性表)】的数据库操作Service
* @createDate 2024-08-10 15:48:00
*/
public interface AttrKeyService extends IService<AttrKey> {

    List<AttrKeyVo> listAttrInfo();
}
