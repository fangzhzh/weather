package weather.fangzhzh.com.weather.data;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author zhangzf
 * @since 14/10/16 7:08 PM
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface UserScope {
}
