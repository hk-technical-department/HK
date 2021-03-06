package njhk.wisdom.web.api.controller.serve;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;

import njhk.wisdom.web.bean.entity.pojo.giftcert.CouponConfig;
import njhk.wisdom.web.bean.vo.Coupon_ConfigVo;
import njhk.wisdom.web.api.config.BaseController;
import njhk.wisdom.web.service.impl.giftcert.Coupon_ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 设备接口
 *
 * @author chengsheng
 * @version 2017-11-11
 */
@Api(tags = "获取禾康币查询接口")
@Controller
@RequestMapping(value = "/Coupon_Config/info/*")
public class CouponConfigController extends BaseController {
    @Autowired
    private Coupon_ConfigService coupon_ConfigService;

    /**
     * 获取会员获取禾康币列表
     *
     * @param
     * @return
     */
    @ApiOperation(value = "获取禾康币列表", notes = "获取禾康币列表", produces = "application/json", response = Coupon_ConfigVo.class)
    @RequestMapping(value = "/getCoupon_Config", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getCoupon_Config(
            @ApiParam(required = true, name = "pageNo", value = "页号") @RequestParam(value = "pageNo") Integer pageNo,
            @ApiParam(required = true, name = "pageSize", value = "每页条数") @RequestParam(value = "pageSize") Integer pageSize,
            @ApiParam(required = false, name = "id", value = "用户id") @RequestParam(value = "id", required = false) String id)
    {
        Page<CouponConfig> objectPage = new Page<CouponConfig>(pageNo, pageSize);
        Page<Coupon_ConfigVo> voObjectPage = new Page<Coupon_ConfigVo>(pageNo, pageSize);
        CouponConfig object =new CouponConfig();
        objectPage = coupon_ConfigService.findPage(objectPage, object);
        if (objectPage.getList().isEmpty()) {
            return HttpMessageUtils.getReturnMap(null, "无对应记录", HttpConstants.NotSupport);
        }
        List<Coupon_ConfigVo> voObjectList = new ArrayList<Coupon_ConfigVo>();
        for (CouponConfig forObject : objectPage.getList()) {
            Coupon_ConfigVo voObject = new Coupon_ConfigVo();
            voObject.setId(forObject.getId());
            voObject.setFirstReg(forObject.getFirstReg());
            voObject.setLimitPerOrder(forObject.getLimitPerOrder());
            voObject.setMinAmount(forObject.getMinAmount());
            voObject.setPoints(forObject.getPoints());
            voObject.setPoints2Coupon(forObject.getPoints2Coupon());
            voObject.setMoney(forObject.getMoney());
            voObject.setMoney2Coupon(forObject.getMoney2Coupon());
            voObject.setTime(forObject.getTime());
            voObject.setTime2Coupon(forObject.getTime2Coupon());

            voObjectList.add(voObject);
        }
        if (voObjectList.isEmpty()) {
            return HttpMessageUtils.getReturnMap(voObjectPage, "无对应记录", HttpConstants.NotSupport);
        }
        voObjectPage.setList(voObjectList);
        voObjectPage.setCount(objectPage.getCount());
        return HttpMessageUtils.getReturnMap(voObjectPage, "获取获取禾康币成功", HttpConstants.OK);
    }


    /**
     * 修改获取禾康币信息
     *
     * @param
     * @return
     */

    @ApiOperation(value = "修改获取禾康币信息列表", notes = "修改获取禾康币信息列表", produces = "application/json", response = CouponConfig.class)
    @RequestMapping(value = "/updateCoupon_Config", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> updateCoupon_Config(
            @ApiParam(required = false, name = "money", value = "参数一") @RequestParam(value = "money", required = false) int money,
            @ApiParam(required = false, name = "money2Coupon", value = "参数一") @RequestParam(value = "money2Coupon", required = false) int money2Coupon)
    {
        CouponConfig objects=new CouponConfig();
        objects.setMoney(money);
        objects.setMoney2Coupon(money2Coupon);

        try {
            coupon_ConfigService.save(objects);
            return  HttpMessageUtils.getReturnMap(null,"获取禾康币更新成功", HttpConstants.OK);
        } catch (Exception e) {
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.OK);

        }
    }


    /**
     * 增加获取禾康币信息
     *
     * @param
     * @return
     */
    @ApiOperation(value = "增加获取禾康币", notes = "增加获取禾康币", produces = "application/json", response = CouponConfig.class)
    @RequestMapping(value = "/insertCoupon_Config", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> insertCoupon_Config(
            @ApiParam(required = false, name = "money", value = "参数一") @RequestParam(value = "addressName", required = false) int money,
            @ApiParam(required = false, name = "money2Coupon", value = "参数二") @RequestParam(value = "addressType", required = false) int money2Coupon)
    {
        CouponConfig objects=new CouponConfig();
        objects.setMoney(money);
        objects.setMoney2Coupon(money2Coupon);
        try {
            coupon_ConfigService.save(objects);
            return  HttpMessageUtils.getReturnMap(null,"获取禾康币增加成功",HttpConstants.OK);
        } catch (Exception e) {
            return  HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.OK);

        }
    }



    /**
     * 删除获取禾康币
     *
     * @param
     * @return
     */
    @ApiOperation(value = "删除获取禾康币", notes = "删除获取禾康币", produces = "application/json", response = CouponConfig.class)
    @RequestMapping(value = "/deleteCoupon_Config", method = RequestMethod.POST)
    @ResponseBody

    public Map<String,Object> deleteCoupon_Config( @ApiParam(
            required = false, name = "id", value = "用户id") @RequestParam(value = "id", required = false) String id)
    {
        CouponConfig objects=new CouponConfig();
        objects.setId(id);

        try {
            coupon_ConfigService.delete(objects);
            return  HttpMessageUtils.getReturnMap(null,"获取禾康币删除成功",HttpConstants.OK);
        } catch (Exception e) {
            return  HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.OK);

        }
    }



}
