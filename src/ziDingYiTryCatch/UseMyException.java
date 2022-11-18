package ziDingYiTryCatch;

import enumPkg.LoginEnum;

/**
 * 在需要抛出异常的地方使用异常类
 */
public class UseMyException
{
    private String name;
    private String password;

    public UseMyException(String name, String password)
    {
        this.name = name;
        this.password = password;
    }

    public void throwException(String password) throws MyException
    {
        if (!this.password.equals(password))
        {
            throw new MyException(LoginEnum.ERROR);
        }
    }
}