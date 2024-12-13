package a1p2_softwaretesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MemberTest {

    @Test
    public void testMemberConstructor() {
        // Arrange
        String name = "John Doe";
        String id = "12345";

        // Act
        var sut = new Member(name, id);

        // Assert
        assertEquals(name, sut.getName(), "Name does not match.");
        assertEquals(id, sut.getId(), "ID does not match.");
    }
}
