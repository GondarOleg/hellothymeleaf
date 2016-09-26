package hello.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Oleg on 9/26/2016.
 */
@Component
@Aspect
public class AroundAspect {

    @Autowired
    BeforeAspect beforeAspect;

    private static final Logger LOGGER = LoggerFactory.getLogger(AroundAspect.class);

    @Around("hello.aspects.AspectsPointcut.savePointcut()")
    public String around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        LOGGER.info("_________Around aspect___________");
        LOGGER.info("------------------Before----------------");
        if (2 > beforeAspect.getSavingCount()) {
            proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
            return "redirect:/";
        }
        LOGGER.info("------------------After-----------------");
        return "redirect:/deny";
    }
}
