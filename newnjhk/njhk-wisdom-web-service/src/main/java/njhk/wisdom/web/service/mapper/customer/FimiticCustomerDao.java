package njhk.wisdom.web.service.mapper.customer;

import njhk.wisdom.web.bean.entity.pojo.customer.FimiticCustomer;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FimiticCustomerDao extends CrudDao<FimiticCustomer> {
}
