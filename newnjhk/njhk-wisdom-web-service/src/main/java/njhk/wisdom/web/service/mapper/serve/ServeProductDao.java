package njhk.wisdom.web.service.mapper.serve;

import njhk.wisdom.web.bean.entity.server.ServeProduct;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ServeProductDao extends CrudDao<ServeProduct> {
}
