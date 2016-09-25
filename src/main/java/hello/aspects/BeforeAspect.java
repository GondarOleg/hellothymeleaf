package hello.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Created by Oleg on 9/25/2016.
 */

@Component
@Aspect
public class BeforeAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(BeforeAspect.class);

    private int savingCount = 0;

    public int getSavingCount() {
        return savingCount;
    }

    @Before("hello.aspects.AspectsPointcut.savePointcut()")
    public void beforeSaveOperation(){
        LOGGER.info("_________Before aspect___________");
        savingCount++;
    }

}
