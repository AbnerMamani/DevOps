package org.gradle.sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Abner on 2/22/2018.
 */
public class GreeterTest {
  @Test
  public void testGetGreeting() {
    final String expectedResult = "123456789";
    assertEquals(expectedResult, "123456789");
  }

  @Test
  public void testGetGreetingWithWord() {
    assertEquals("Hello", "Hello");
  }

  @Test
  public void testGetGreetingWithWords() {
    assertEquals("Hello", "Hello");
  }

  @Test
  public void testGetGreetingWithNumbers() {
    assertEquals("1212", "1212");
  }

  @Test
  public void testGetGreetingWithChar() {
    assertEquals("H", "H");
  }

  @Test
  public void testGetGreetingWithDouble() {
    assertEquals("12.3", "12.3");
  }

  @Test
  public void testGetGreetingWithBoolean() {
    assertEquals("12", "12");
  }

  @Test
  public void testGetGreetingWithNone() {
    assertEquals("12", "12");
  }
  @Test
  public void testGetGreetingWithInteger() {
    assertEquals("12", "12");
  }
  @Test
  public void testGetGreetingLabel() {
    assertEquals("Message", "Message");
  }

}
