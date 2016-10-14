package weather.fangzhzh.com.weather.data;

import dagger.Subcomponent;

/**
 * @author zhangzf
 * @since 14/10/16 5:12 PM
 */
@UserScope
@Subcomponent(
        modules = {
                UserModule.class
        }
)
public interface UserComponent {


}
