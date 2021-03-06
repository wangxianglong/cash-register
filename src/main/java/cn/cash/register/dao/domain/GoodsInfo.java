package cn.cash.register.dao.domain;

import java.util.Date;

import cn.cash.register.util.Money;

public class GoodsInfo extends BaseDomain {
    /**  */
    private static final long serialVersionUID = -3079051475219611653L;

    private Long              id;

    private Long              goodsImageId;

    private String            goodsName;

    private String            barCode;

    private String            productNumber;

    private String            pinyinCode;

    private String            categoryName;

    private Boolean           goodsStatus;

    private String            goodsBrand;

    private String            goodsColor;

    private String            goodsSize;

    private String            goodsTag;

    private Integer           goodsStock;

    private String            quantityUnit;

    private Integer           stockUpperLimit;

    private Integer           stockLowerLimit;

    private Money             lastImportPrice;

    private Money             averageImportPrice;

    private Money             salesPrice;

    private Money             tradePrice;

    private Money             vipPrice;

    private Boolean           isVipDiscount;

    private String            supplierName;

    private String            productionDate;

    private Integer           qualityGuaranteePeriod;

    private Boolean           isIntegral;

    private String            royaltyType;

    private Boolean           isBooked;

    private Boolean           isGift;

    private Boolean           isWeigh;

    private Boolean           isFixedPrice;

    private Boolean           isTimeingPrice;

    private Boolean           isHidden;

    private Long              promotionId;

    private String            remark;

    private Date              gmtUpdate;

    private Date              gmtCreate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodsImageId() {
        return goodsImageId;
    }

    public void setGoodsImageId(Long goodsImageId) {
        this.goodsImageId = goodsImageId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber == null ? null : productNumber.trim();
    }

    public String getPinyinCode() {
        return pinyinCode;
    }

    public void setPinyinCode(String pinyinCode) {
        this.pinyinCode = pinyinCode == null ? null : pinyinCode.trim();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Boolean getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Boolean goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getGoodsBrand() {
        return goodsBrand;
    }

    public void setGoodsBrand(String goodsBrand) {
        this.goodsBrand = goodsBrand == null ? null : goodsBrand.trim();
    }

    public String getGoodsColor() {
        return goodsColor;
    }

    public void setGoodsColor(String goodsColor) {
        this.goodsColor = goodsColor == null ? null : goodsColor.trim();
    }

    public String getGoodsSize() {
        return goodsSize;
    }

    public void setGoodsSize(String goodsSize) {
        this.goodsSize = goodsSize == null ? null : goodsSize.trim();
    }

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag == null ? null : goodsTag.trim();
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
        this.quantityUnit = quantityUnit == null ? null : quantityUnit.trim();
    }

    public Integer getStockUpperLimit() {
        return stockUpperLimit;
    }

    public void setStockUpperLimit(Integer stockUpperLimit) {
        this.stockUpperLimit = stockUpperLimit;
    }

    public Integer getStockLowerLimit() {
        return stockLowerLimit;
    }

    public void setStockLowerLimit(Integer stockLowerLimit) {
        this.stockLowerLimit = stockLowerLimit;
    }

    public Money getLastImportPrice() {
        return lastImportPrice;
    }

    public void setLastImportPrice(Money lastImportPrice) {
        this.lastImportPrice = lastImportPrice;
    }

    public Money getAverageImportPrice() {
        return averageImportPrice;
    }

    public void setAverageImportPrice(Money averageImportPrice) {
        this.averageImportPrice = averageImportPrice;
    }

    public Money getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Money salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Money getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(Money tradePrice) {
        this.tradePrice = tradePrice;
    }

    public Money getVipPrice() {
        return vipPrice;
    }

    public void setVipPrice(Money vipPrice) {
        this.vipPrice = vipPrice;
    }

    public Boolean getIsVipDiscount() {
        return isVipDiscount;
    }

    public void setIsVipDiscount(Boolean isVipDiscount) {
        this.isVipDiscount = isVipDiscount;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate == null ? null : productionDate.trim();
    }

    public Integer getQualityGuaranteePeriod() {
        return qualityGuaranteePeriod;
    }

    public void setQualityGuaranteePeriod(Integer qualityGuaranteePeriod) {
        this.qualityGuaranteePeriod = qualityGuaranteePeriod;
    }

    public Boolean getIsIntegral() {
        return isIntegral;
    }

    public void setIsIntegral(Boolean isIntegral) {
        this.isIntegral = isIntegral;
    }

    public String getRoyaltyType() {
        return royaltyType;
    }

    public void setRoyaltyType(String royaltyType) {
        this.royaltyType = royaltyType == null ? null : royaltyType.trim();
    }

    public Boolean getIsBooked() {
        return isBooked;
    }

    public void setIsBooked(Boolean isBooked) {
        this.isBooked = isBooked;
    }

    public Boolean getIsGift() {
        return isGift;
    }

    public void setIsGift(Boolean isGift) {
        this.isGift = isGift;
    }

    public Boolean getIsWeigh() {
        return isWeigh;
    }

    public void setIsWeigh(Boolean isWeigh) {
        this.isWeigh = isWeigh;
    }

    public Boolean getIsFixedPrice() {
        return isFixedPrice;
    }

    public void setIsFixedPrice(Boolean isFixedPrice) {
        this.isFixedPrice = isFixedPrice;
    }

    public Boolean getIsTimeingPrice() {
        return isTimeingPrice;
    }

    public void setIsTimeingPrice(Boolean isTimeingPrice) {
        this.isTimeingPrice = isTimeingPrice;
    }

    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    public Long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}