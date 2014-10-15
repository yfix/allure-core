package ru.yandex.qatools.allure.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *         <p>Use this annotation to link a single issue from issue tracker to test cases and test suites. Usage:
 *         {@code
 *         @Issue("MYPROJECT-1")
 *         public void myTest(){
 *             ...
 *         }
 *         }
 *
 *         </p>
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Issue {
    
    String value();
    
}
