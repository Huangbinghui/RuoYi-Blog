package com.ruoyi.common.constant;

/**
 * 缓存的key 常量
 * 
 * @author ruoyi
 */
public class CacheConstants
{
    /**
     * 登录用户 redis key
     */
    public static final String LOGIN_TOKEN_KEY = "login_tokens:";

    /**
     * 验证码 redis key
     */
    public static final String CAPTCHA_CODE_KEY = "captcha_codes:";

    /**
     * 参数管理 cache key
     */
    public static final String SYS_CONFIG_KEY = "sys_config:";

    /**
     * 字典管理 cache key
     */
    public static final String SYS_DICT_KEY = "sys_dict:";

    public static final String SYS_DICT_KEY_LOCK = "lock:sys_dict:";

    /**
     * 防重提交 redis key
     */
    public static final String REPEAT_SUBMIT_KEY = "repeat_submit:";

    /**
     * 限流 redis key
     */
    public static final String RATE_LIMIT_KEY = "rate_limit:";

    /**
     * 登录账户密码错误次数 redis key
     */
    public static final String PWD_ERR_CNT_KEY = "pwd_err_cnt:";

    public static final String SHOP_KEY = "shop:";
    public static final Integer CACHE_SHOP_TTL = 30;
    public static final Integer CACHE_NULL_TTL = 10;

    /**
     * 秒杀优惠券的分布式锁 key
     */
    public static final String SALE_VOUCHER_LOCK = "lock:voucher:";
    /**
     * 秒杀优惠券的库存 key
     */
    public static final String FLASH_SALE_VOUCHER_STOCK = "stock:voucher:";
    /**
     * 秒杀优惠券的库存 key
     */
    public static final String FLASH_SALE_VOUCHER_ORDER = "order:voucher:";

}
