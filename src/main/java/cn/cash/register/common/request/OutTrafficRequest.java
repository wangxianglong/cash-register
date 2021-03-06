/**
 * Cash-Register
 * Copyright (c) 1995-2018 All Rights Reserved.
 */
package cn.cash.register.common.request;

import cn.cash.register.util.AssertUtil;

/**
 * 商品出库请求类
 * @author HuHui
 * @version $Id: OutTrafficRequest.java, v 0.1 2018年4月25日 上午10:37:41 HuHui Exp $
 */
public class OutTrafficRequest extends BaseRequest {

    /**  */
    private static final long serialVersionUID = -9013078378954805963L;

    private Long              goodsId;

    private String            trafficType;

    private String            goodsName;

    private String            barCode;

    private String            goodsColor;

    private String            goodsSize;

    private String            supplierName;

    private Integer           goodsStock;

    private String            quantityUnit;

    private String            outPriceType;

    private String            outAmount;

    private Integer           outCount;

    private String            totalAmount;

    private String            operatorNo;

    private String            remark;

    @Override
    public void validate() {
        AssertUtil.assertNotBlank(goodsName, "商品名不能为空");
        AssertUtil.assertNotBlank(barCode, "条码不能为空");
        AssertUtil.assertNotNull(goodsStock, "商品库存不能为空");
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getTrafficType() {
        return trafficType;
    }

    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getGoodsColor() {
        return goodsColor;
    }

    public void setGoodsColor(String goodsColor) {
        this.goodsColor = goodsColor;
    }

    public String getGoodsSize() {
        return goodsSize;
    }

    public void setGoodsSize(String goodsSize) {
        this.goodsSize = goodsSize;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Integer getGoodsStock() {
        return goodsStock;
    }

    public void setGoodsStock(Integer goodsStock) {
        this.goodsStock = goodsStock;
    }

    public String getQuantityUnit() {
        return quantityUnit;
    }

    public void setQuantityUnit(String quantityUnit) {
        this.quantityUnit = quantityUnit;
    }

    public String getOutPriceType() {
        return outPriceType;
    }

    public void setOutPriceType(String outPriceType) {
        this.outPriceType = outPriceType;
    }

    public Integer getOutCount() {
        return outCount;
    }

    public void setOutCount(Integer outCount) {
        this.outCount = outCount;
    }

    public String getOperatorNo() {
        return operatorNo;
    }

    public void setOperatorNo(String operatorNo) {
        this.operatorNo = operatorNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOutAmount() {
        return outAmount;
    }

    public void setOutAmount(String outAmount) {
        this.outAmount = outAmount;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

}
