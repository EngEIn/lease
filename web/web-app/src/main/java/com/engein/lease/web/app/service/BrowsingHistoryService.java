package com.engein.lease.web.app.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.engein.lease.model.entity.BrowsingHistory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.engein.lease.web.app.vo.history.HistoryItemVo;

/**
* @author engein
* @description 针对表【browsing_history(浏览历史)】的数据库操作Service
* @createDate 2023-07-26 11:12:39
*/
public interface BrowsingHistoryService extends IService<BrowsingHistory> {

    IPage<HistoryItemVo> pageHistoryItemByUserId(IPage<HistoryItemVo> page, Long userId);

    void saveHistory(Long userId, Long roomId);

}
