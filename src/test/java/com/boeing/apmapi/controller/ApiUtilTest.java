package com.boeing.apmapi.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.boeing.apmapi.Utils.ApiUtil;

class ApiUtilTest {

    @Test
    void testValidNodeIdFormat() {
        // Arrange
        String validNodeId = "123.ABC.456.789.123.5678";

        // Act & Assert
        Assertions.assertDoesNotThrow(() -> ApiUtil.validateNodeIdFormat(validNodeId));
    }

    @Test
    void testValidShortNodeIdFormat() {
        // Arrange
        String validNodeId = "123.ABC.456.789.333";

        // Act & Assert
        Assertions.assertDoesNotThrow(() -> ApiUtil.validateNodeIdFormat(validNodeId));
    }
    @Test
    void testInvalidNodeIdFormat() {
        // Arrange
        String invalidNodeId = "invalidNodeId";

        // Act & Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> ApiUtil.validateNodeIdFormat(invalidNodeId));
    }

    @Test
    void testNullNodeId() {
       
        // Act & Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> ApiUtil.validateNodeIdFormat(null));
    }
}