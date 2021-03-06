package demo;

import com.jfinal.config.*;
import com.jfinal.template.Engine;

/**
 * @author ab
 * @description
 * @date
 */
public class DemoConfig extends JFinalConfig {

    @Override
    public void configConstant(Constants me) {
        me.setDevMode(true);
    }

    @Override
    public void configRoute(Routes me) {
        me.add("/hello", HelloController.class);
    }

    /**
     * Config engine
     *
     * @param me
     */
    @Override
    public void configEngine(Engine me) {

    }

    @Override
    public void configPlugin(Plugins me) {
    }

    @Override
    public void configInterceptor(Interceptors me) {
    }

    @Override
    public void configHandler(Handlers me) {
    }
}