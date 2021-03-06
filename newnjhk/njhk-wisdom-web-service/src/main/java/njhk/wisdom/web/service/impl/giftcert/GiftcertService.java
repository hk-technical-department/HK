package njhk.wisdom.web.service.impl.giftcert;

import njhk.wisdom.web.bean.entity.pojo.giftcert.Giftcert;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.giftcert.GiftcertDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class GiftcertService extends CrudService<GiftcertDao, Giftcert> {
}
