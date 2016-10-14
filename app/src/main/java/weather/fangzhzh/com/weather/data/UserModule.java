package weather.fangzhzh.com.weather.data;

import dagger.Module;
import dagger.Provides;
import weather.fangzhzh.com.weather.data.model.User;

/**
 * @author zhangzf
 * @since 14/10/16 7:08 PM
 */
@Module
public class UserModule {
    private User user;
    public UserModule(User user) {
        this.user = user;
    }

    @Provides
    @UserScope
    User provideUser() {
        return user;
    }
}
