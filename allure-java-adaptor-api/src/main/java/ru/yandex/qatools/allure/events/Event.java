package ru.yandex.qatools.allure.events;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 11.11.13
 *         <p/>
 *         User of this interface has control over test context
 * @see ru.yandex.qatools.allure.events.StepEvent
 * @see ru.yandex.qatools.allure.events.TestCaseEvent
 * @see ru.yandex.qatools.allure.events.TestSuiteEvent
 */
public interface Event<T> {

    /**
     * Use this method to change test context
     *
     * @param context which can be changed
     */
    void process(T context);
}
