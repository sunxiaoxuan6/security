package generate;

import java.io.Serializable;
import lombok.Data;

/**
 * hr
 * @author 
 */
@Data
public class Hr implements Serializable {
    /**
     * hrID
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 住宅电话
     */
    private String telephone;

    /**
     * 联系地址
     */
    private String address;

    private Boolean enabled;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    private String userface;

    private String remark;

    private static final long serialVersionUID = 1L;
}