/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package test;

import org.junit.jupiter.api.Test;

import jdk.jfr.Timestamp;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    public void testNull(){
        assertFalse(App.earch(null,1));
    }
}
