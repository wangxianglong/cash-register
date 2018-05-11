/**
 * Cash-Register
 * Copyright (c) 1995-2018 All Rights Reserved.
 */
package cn.cash.register.controller.backstage;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.cash.register.common.request.ExchangeJobQueryRequest;
import cn.cash.register.common.request.SalesBasicFactsQueryRequest;
import cn.cash.register.dao.domain.ExchangeJobDetail;
import cn.cash.register.dao.domain.SalesBasicFacts;
import cn.cash.register.service.ExchangeJobService;
import cn.cash.register.service.SalesService;
import cn.cash.register.util.AssertUtil;
import cn.cash.register.util.ResultSet;

/**
 * 销售相关接口的Controller
 * @author HuHui
 * @version $Id: SalesController.java, v 0.1 2018年5月3日 下午3:27:14 HuHui Exp $
 */
@Controller
@RequestMapping(value = "/admin/sales")
public class SalesController {

    @Resource
    private ExchangeJobService exchangeJobService;

    @Resource
    private SalesService       salesService;

    /**
     * 查询交接班记录
     */
    @ResponseBody
    @PostMapping(value = "/queryExchangeJobs")
    public ResultSet queryExchangeJobs(ExchangeJobQueryRequest request) {
        List<ExchangeJobDetail> exchangeJobs = exchangeJobService.query(request);
        return ResultSet.success().put("exchangeJobs", exchangeJobs);
    }

    /**
     * 查询营业概况
     */
    @ResponseBody
    @PostMapping(value = "/queryBasicFacts")
    public ResultSet queryBasicFacts(SalesBasicFactsQueryRequest request) {
        AssertUtil.assertNotNull(request, "查询参数不能为空");
        Map<String, SalesBasicFacts> basicFacts = salesService.queryBasicFacts(request);
        return ResultSet.success().put("basicFacts", basicFacts);
    }

}