package hello.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Oleg on 9/25/2016.
 */

@Component
@Aspect
public class AspectsPointcut {
    @Pointcut( "execution(* *.save(..))")
    public void savePointcut(){
    }

    @Pointcut( "execution(* *.deny(..))")
    public void denyPointcut(){
    }

    @Pointcut( "execution(* *.show(..))")
    public void showPointcut(){
    }
}
