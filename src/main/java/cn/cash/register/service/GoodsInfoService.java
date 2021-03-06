/**
 * Cash-Register
 * Copyright (c) 1995-2018 All Rights Reserved.
 */
package cn.cash.register.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

import cn.cash.register.common.request.GoodsInfoInportRequest;
import cn.cash.register.common.request.GoodsInfoQueryRequest;
import cn.cash.register.common.request.GoodsInfoRequest;
import cn.cash.register.dao.domain.GoodsImage;
import cn.cash.register.dao.domain.GoodsInfo;
import cn.cash.register.enums.UpdateFieldEnum;

/**
 * 商品信息服务接口
 * @author HuHui
 * @version $Id: GoodsInfoService.java, v 0.1 2018年4月19日 上午11:42:29 HuHui Exp $
 */
public interface GoodsInfoService {

    /**
     * 增加商品
     * 返回主键id
     */
    Long add(GoodsInfoRequest request);

    /**
     * 根据id删除商品
     */
    void delete(List<Long> ids);

    /**
     * 修改商品
     */
    int update(GoodsInfoRequest request);

    /**
     * 修改商品
     */
    int update(GoodsInfo goodsInfo);

    /**
     * 修改商品库存
     * @param id     商品id
     * @param count  变动数量,可为正/负
     */
    int updateStock(Long id, int count);

    /**
     * 根据id查询商品
     */
    GoodsInfo queryById(Long id);

    /**
     * 根据条码/拼音码/商品名查询商品
     * @return 结果不翻页
     */
    List<GoodsInfo> search(String keyword);

    /**
     * 翻页查询
     */
    PageInfo<GoodsInfo> queryList(GoodsInfoQueryRequest request);

    /**
     * 查询所有商品信息
     */
    List<GoodsInfo> queryAll();

    /**
     * 修改商品图片
     * 商品图片的增、删、改都可以调用此方法,删除的时候图片数组传null
     * @param goodsInfoId  商品id
     * @param goodsImage   图片二进制数据
     */
    void updateGoodsImage(Long goodsInfoId, byte[] goodsImage);

    /**
     * 查询商品图片
     * @param goodsImageId  商品图片id
     */
    GoodsImage queryGoodsImage(Long goodsImageId);

    /**
     * 批量操作
     */
    void batchUpdate(List<Long> goodsIds, String newValue, UpdateFieldEnum filedEnumCode);

    /**
     * 查询所有有效商品种类数
     */
    int queryGoodsCount();

    /**
     * 导出商品数据为Excel文件(实际的商品导出未使用该接口)
     * @param request  查询请求
     * @return         Excel文件路径
     */
    @Deprecated
    String export(GoodsInfoQueryRequest request);

    /**
     * 将Excel中的商品数据导入到数据库
     * @param request  导入请求类
     */
    void inport(GoodsInfoInportRequest request);

    /**
     * 查询某页商品信息用于导出
     * 
     * @param request
     * @return
     */
    List<GoodsInfo> queryListForExport(GoodsInfoQueryRequest request);

}
