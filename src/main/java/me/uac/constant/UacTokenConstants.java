package me.uac.constant;

/**
 * <p>Title: UacTokenConstants. </p>
 * <p>Description 用户账户中心Token常量 </p>
 *
 * @author dragon
 * @date 2018/3/30 下午9:52
 */
public class UacTokenConstants {

    /**
     * 密钥 - 解密登陆用户名和密码使用
     */
    public static final String SECRET_TOKEN = "SECRET_TOKEN";

    /**
     * 密钥 - jwt签名使用
     */
    public static final String TOKEN_KEY = "TOKEN_KEY";

    /**
     * 线程变量名 - token
     */
    public static final String JWT_TOKEN = "JWT_TOKEN";

    /**
     * 线程变量 - jwt用户信息
     */
    public static final String AUTH_USER_DTO = "AUTH_USER_DTO";

    /**
     * cookie名 - token
     */
    public static final String UAC_TOKEN = "UAC_TOKEN";
}
