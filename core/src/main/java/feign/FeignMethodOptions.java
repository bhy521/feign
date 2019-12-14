package feign;

import java.lang.annotation.*;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FeignMethodOptions {
    int connectTimeoutMillis();

    int readTimeoutMillis();

    boolean followRedirects() default true;
}
