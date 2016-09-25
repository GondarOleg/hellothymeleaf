package hello.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Oleg on 9/26/2016.
 */
@Component
@Aspect
public class AroundAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(AroundAspect.class);

    @Around("hello.aspects.AspectsPointcut.showPointcut()")
    public String around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        LOGGER.info("_________Around aspect___________");
        LOGGER.info("------------------Before----------------");
        proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
        LOGGER.info("------------------After-----------------");
        return "show";
    }
}
