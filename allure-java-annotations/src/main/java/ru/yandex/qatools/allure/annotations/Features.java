package ru.yandex.qatools.allure.annotations;

import java.lang.annotation.*;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 25.12.13
 *         <p/>
 *         In order to group your tests by features simply annotate test suite
 *         or test case with {@link ru.yandex.qatools.allure.annotations.Features}
 *         annotation. This annotation can take either one string or a string
 *         array because one test case can relate to several features:
 *         {@code
 *         @Features({"Feature1", "Feature2"})
 *         @Test
 *         public void myTest() {
 *             ...
 *         }
 *
 *         @Features("Feature")
 *         @Test
 *         public void myTest() {
 *             ...
 *         }
 *         }
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Features {

    String[] value();

}
