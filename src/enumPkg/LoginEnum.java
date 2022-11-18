package enumPkg;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LoginEnum {
    ERROR(-1, "登录失败"),
    PASSWORD_ERROR(1, "用户名或密码错误");

//    LoginEnum(Integer code, String message)
//    {
//        this.code = code;
//        this.message = message;
//    }

    private Integer code;
    private String message;
}
