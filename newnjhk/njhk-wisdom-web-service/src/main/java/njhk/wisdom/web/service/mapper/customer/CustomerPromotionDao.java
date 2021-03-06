package njhk.wisdom.web.service.mapper.customer;

import njhk.wisdom.web.bean.entity.pojo.customer.CustomerPromotion;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerPromotionDao extends CrudDao<CustomerPromotion> {
}
