package njhk.wisdom.web.service.impl.unknown;

import njhk.wisdom.web.bean.entity.other.Training;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.unknown.TrainingDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class TrainingService extends CrudService<TrainingDao, Training> {
}
