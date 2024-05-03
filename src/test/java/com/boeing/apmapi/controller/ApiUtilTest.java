package com.boeing.apmapi.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ApiUtilTest {

    @Test
    void testValidNodeIdFormat() {
        // Arrange
        String validNodeId = "123.ABC.456.789.0";

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
        // Arrange
        String nullNodeId = null;

        // Act & Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> ApiUtil.validateNodeIdFormat(null));
    }
}