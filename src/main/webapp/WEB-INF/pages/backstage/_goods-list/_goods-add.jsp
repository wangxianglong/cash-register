<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 添加或更新商品 -->
<div id="goodsAddDiv" style="display: none;">
    <form class="form-horizontal layerForm">
        <div class="form-group">
            <div class="col-xs-7">
            	<div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-exclamation" style="color:red;"></i>&nbsp;状态</span>
                    <span class="input-group-addon">
                    	<input type="radio" v-model="goods.goodsStatus" value="true">启用
                    </span>
                    <span class="input-group-addon">
                    	<input type="radio" v-model="goods.goodsStatus" value="false">禁用
                    </span>
                </div>
            </div>
            <div class="col-xs-5">
            	<input v-if="switches.displayImageUpload" type="file" name="image" class="form-control" value=""/>
            </div>
        </div>
        <div class="form-group">
            <div class="col-xs-7">
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-exclamation" style="color:red;"></i>&nbsp;条码</span>
                    <input type="text" class="form-control" v-model="goods.barCode">
                    <span class="input-group-btn"><button class="btn btn-success" type="button" @click="getBarCode">生成</button></span>
                </div>
            </div>
            <div class="col-xs-5">
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-exclamation" style="color:red;"></i>&nbsp;品名</span>
                    <input type="text" class="form-control" v-model="goods.goodsName">
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-xs-7">
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-exclamation" style="color:red;"></i>&nbsp;货号</span>
                    <input type="text" class="form-control" v-model="goods.productNumber" id="productNumberInput">
                    <span class="input-group-addon"><input type="checkbox" v-model="switches.prodNumSame">和条码一致</span>
                </div>
            </div>
            <div class="col-xs-5">
            	<select class="form-control" v-model="goods.categoryName">
                    <option value="">选择商品分类</option>
                    <option v-for="category in goods_categorys" :value="category.name">{{category.prefix+category.name}}</option>
                </select>
            </div>
        </div>
        <div class="form-group">
        	<div class="col-xs-7">
            	<div class="input-group" v-if="goods.id==null">
                    <span class="input-group-addon"><input type="checkbox" v-model="switches.colorSize"></span>
                    <input type="text" class="form-control" readonly placeholder="未开启颜色尺码选择开关" :value="select_color_size">
                    <span class="input-group-btn"><button id="colorSizeBtn" class="btn btn-primary" type="button" @click="_editGoodsColorSize" disabled>选择颜色尺码</button></span>
                </div>
            </div>
            <div class="col-xs-5">
                <div class="btn-group btn-group-justified" role="group">
                    <div class="btn-group" role="group">
                        <button type="button" class="btn btn-default" @click="_editGoodsStock"><i class="fa fa-exclamation" style="color:red;"></i>&nbsp;输入库存</button>
                    </div>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-xs-7">
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-exclamation" style="color:red;"></i>&nbsp;售价</span>
                    <input type="text" class="form-control" v-model="goods.salesPrice" placeholder="0.00">
                    <span class="input-group-addon">元</span>
                </div>
            </div>
            <div class="col-xs-5">
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-exclamation" style="color:red;"></i>&nbsp;进价</span>
                    <input type="text" class="form-control" v-model="goods.lastImportPrice" placeholder="0.00">
                    <span class="input-group-addon">元</span>
                </div>
            </div>
        </div>
        <h5 class="page-header"></h5>
        <div class="alert alert-warning alert-dismissible" role="alert">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            完善下列商品拓展信息，有助于日常的经营管理哦！
        </div>
        <div class="form-group">
            <div class="col-xs-7">
                <div class="input-group">
                    <span class="input-group-addon"><input type="checkbox" v-model="goods.isVipDiscount">会员折扣</span>
                    <span class="input-group-addon">会员价</span>
                    <input type="text" class="form-control" id="goodsVipPriceInput" v-model="goods.vipPrice" placeholder="未设置" readonly>
                    <span class="input-group-addon">元</span>
                </div>
            </div>
            <div class="col-xs-5">
                <div class="input-group">
                    <span class="input-group-addon">批发价</span>
                    <input type="text" class="form-control" v-model="goods.tradePrice" placeholder="0.00">
                    <span class="input-group-addon">元</span>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-xs-7">
                <div class="input-group">
                    <span class="input-group-addon">主单位</span>
                    <input type="text" class="form-control" v-model="goods.quantityUnit" readonly>
                    <span class="input-group-btn"><button class="btn btn-primary" type="button" @click="_editGoodsUnit">选择</button></span>
                </div>
            </div>
            <div class="col-xs-5">
                <div class="input-group">
                    <span class="input-group-addon">拼音码</span>
                    <input type="text" class="form-control" v-model="goods.pinyinCode">
                    <span class="input-group-btn"><button class="btn btn-success" type="button" @click="getPinyinCode">生成</button></span>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-xs-7">
                <div class="input-group">
                    <span class="input-group-addon">商品品牌</span>
                    <input type="text" class="form-control" v-model="goods.goodsBrand" readonly>
                    <span class="input-group-btn"><button class="btn btn-primary" type="button" @click="_editGoodsBrand">选择</button></span>
                </div>
            </div>
            <div class="col-xs-5">
                <div class="input-group">
                    <span class="input-group-addon">供货商</span>
                    <input type="text" class="form-control" v-model="goods.supplierName" readonly>
                    <span class="input-group-btn"><button class="btn btn-primary" type="button" @click="_editGoodsSupplier">选择</button></span>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-xs-7">
                <div class="input-group">
                    <span class="input-group-addon">生产日期</span>
                    <input type="text" class="form-control" v-model="goods.productionDate" placeholder="格式yyyy-MM-dd，如：1989-10-08">
                </div>
            </div>
            <div class="col-xs-5">
                <div class="input-group">
                    <span class="input-group-addon">保质期</span>
                    <input type="text" class="form-control" v-model="goods.qualityGuaranteePeriod">
                    <span class="input-group-addon">天</span>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-xs-7">
                <div class="input-group">
                    <span class="input-group-addon">库存上限</span>
                    <input type="text" class="form-control" v-model="goods.stockUpperLimit">
                </div>
            </div>
            <div class="col-xs-5">
                <div class="input-group">
                    <span class="input-group-addon">库存下限</span>
                    <input type="text" class="form-control" v-model="goods.stockLowerLimit">
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-xs-12">
                <div class="input-group">
                    <span class="input-group-addon">标签</span>
                    <input type="text" class="form-control" readonly v-model="goods.goodsTag">
                    <span class="input-group-btn"><button class="btn btn-primary" type="button" @click="_editGoodsTag('addOrEdit')">选择</button></span>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-xs-12">
            	<textarea class="form-control" rows="3" placeholder="备注" v-model="goods.remark"></textarea>
            </div>
        </div>
    </form>
</div>
<%@ include file="./_goods-colorSize.jsp"%>
<%@ include file="./_goods-stock.jsp"%>
<%@ include file="./_goods-unit.jsp"%>
<%@ include file="./_goods-brand.jsp"%>
<%@ include file="./_goods-tag.jsp"%>
<%@ include file="./_goods-supplier.jsp"%>
<!-- /添加或更新商品 -->
