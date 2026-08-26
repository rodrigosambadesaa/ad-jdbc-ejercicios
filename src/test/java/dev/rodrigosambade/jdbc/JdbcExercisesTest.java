package dev.rodrigosambade.jdbc;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;
class JdbcExercisesTest{
    @Test void queryAndMetadata()throws Exception{
        try(var c=JdbcExercises.open()){
            JdbcExercises.createSchema(c);
            JdbcExercises.insert(c,"Uno",new BigDecimal("5"),2);
            assertEquals(java.util.List.of("Uno"),JdbcExercises.namesUnder(c,BigDecimal.TEN));
            assertTrue(JdbcExercises.columns(c).contains("ID"));
        }
    }
}
