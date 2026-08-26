package dev.rodrigosambade.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JdbcExercisesTest {

    @Test
    void queriesDataAndReadsMetadata() throws Exception {
        try (Connection connection = JdbcExercises.open()) {
            JdbcExercises.createSchema(connection);
            JdbcExercises.insert(
                    connection,
                    "Uno",
                    new BigDecimal("5"),
                    2);

            assertEquals(
                    List.of("Uno"),
                    JdbcExercises.namesUnder(connection, BigDecimal.TEN));
            assertTrue(JdbcExercises.columns(connection).contains("ID"));
        }
    }
}
