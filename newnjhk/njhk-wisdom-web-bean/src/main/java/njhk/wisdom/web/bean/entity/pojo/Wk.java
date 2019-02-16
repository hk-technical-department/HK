package njhk.wisdom.web.bean.entity.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;
@ApiModel(description = "")
@Getter
@Setter
@ToString
public class Wk extends DataEntity<Wk> {

    @ApiModelProperty(value = "")
    private String id;

    @ApiModelProperty(value = "")
    private String name;

    @ApiModelProperty(value = "")
    private Integer age;
}
