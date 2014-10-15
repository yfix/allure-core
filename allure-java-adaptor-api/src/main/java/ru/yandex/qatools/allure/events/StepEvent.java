package ru.yandex.qatools.allure.events;

import ru.yandex.qatools.allure.model.Step;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 13.12.13
 *         <p/>
 *         Implement this interface to allow access to current step context.
 *         Usage see at {@link ru.yandex.qatools.allure.Allure}
 * @see ru.yandex.qatools.allure.events.Event
 */
public interface StepEvent extends Event<Step> {
}
