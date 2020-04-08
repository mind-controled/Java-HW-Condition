package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionTest {

    @Test
    public void increaseFromLowerThanMin() {
        Condition condition = new Condition();
        condition.setMaxTemperature(28);
        condition.setMinTemperature(16);
        condition.setCurrentTemperature(-50);
        condition.increaseCurrentTemperature();
        assertEquals(17, condition.getCurrentTemperature());
    }

    @Test
    public void increaseFromMin() {
        Condition condition = new Condition();
        condition.setMaxTemperature(28);
        condition.setMinTemperature(16);
        condition.setCurrentTemperature(16);
        condition.increaseCurrentTemperature();
        assertEquals(17, condition.getCurrentTemperature());
    }

    @Test
    public void increaseFromBetweenMinAndMax() {
        Condition condition = new Condition();
        condition.setMaxTemperature(28);
        condition.setMinTemperature(16);
        condition.setCurrentTemperature(24);
        condition.increaseCurrentTemperature();
        assertEquals(25, condition.getCurrentTemperature());
    }

    @Test
    public void increaseFromMax() {
        Condition condition = new Condition();
        condition.setMaxTemperature(28);
        condition.setMinTemperature(16);
        condition.setCurrentTemperature(28);
        condition.increaseCurrentTemperature();
        assertEquals(28, condition.getCurrentTemperature());
    }

    @Test
    public void increaseFromOverMax() {
        Condition condition = new Condition();
        condition.setMaxTemperature(28);
        condition.setMinTemperature(16);
        condition.setCurrentTemperature(50);
        condition.increaseCurrentTemperature();
        assertEquals(28, condition.getCurrentTemperature());
    }

    @Test
    public void decreaseFromLowerThanMin() {
        Condition condition = new Condition();
        condition.setMaxTemperature(28);
        condition.setMinTemperature(16);
        condition.setCurrentTemperature(-50);
        condition.decreaseCurrentTemperature();
        assertEquals(16, condition.getCurrentTemperature());
    }

    @Test
    public void decreaseFromMin() {
        Condition condition = new Condition();
        condition.setMaxTemperature(28);
        condition.setMinTemperature(16);
        condition.setCurrentTemperature(16);
        condition.decreaseCurrentTemperature();
        assertEquals(16, condition.getCurrentTemperature());
    }

    @Test
    public void decreaseFromBetweenMinAndMax() {
        Condition condition = new Condition();
        condition.setMaxTemperature(28);
        condition.setMinTemperature(16);
        condition.setCurrentTemperature(17);
        condition.decreaseCurrentTemperature();
        assertEquals(16, condition.getCurrentTemperature());
    }

    @Test
    public void decreaseFromMax() {
        Condition condition = new Condition();
        condition.setMaxTemperature(28);
        condition.setMinTemperature(16);
        condition.setCurrentTemperature(28);
        condition.decreaseCurrentTemperature();
        assertEquals(27, condition.getCurrentTemperature());
    }

    @Test
    public void decreaseFromOverMax() {
        Condition condition = new Condition();
        condition.setMaxTemperature(28);
        condition.setMinTemperature(16);
        condition.setCurrentTemperature(50);
        condition.decreaseCurrentTemperature();
        assertEquals(27, condition.getCurrentTemperature());
    }
}