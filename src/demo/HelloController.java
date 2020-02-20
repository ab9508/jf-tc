package demo;

import com.jfinal.core.Controller;

/**
 * @author ab
 * @description
 * @date
 */
public class HelloController extends Controller {
    public void index() {
        renderText("hello word jfinal");
    }
}
