package hello.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Oleg on 9/25/2016.
 */
@Component
@Aspect
public class AfterAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(AfterAspect.class);

    @After("hello.aspects.AspectsPointcut.denyPointcut()")
    public void afterSave() throws Throwable {

        LOGGER.error("_________After aspect___________");
        LOGGER.error("Access was denied!!!!");
    }

}
