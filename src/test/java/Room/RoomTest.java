package Room;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkIn() {
        //arrange
        Room room = new Room();

        //act
        room.checkIn();

        //assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    void checkOut() {
        //arrange
        Room room = new Room();
        room.setOccupied(true);

        //act
        room.checkOut();

        //assert
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    void cleanRoom() {
        //arrange
        Room room = new Room();
        room.setDirty(true);

        //act
        room.cleanRoom();

        //assert
        assertFalse(room.isDirty());
    }

    @Test
    void cannotCheckIfOccupied(){
        //arrange
        Room room = new Room();

        //act
        room.checkIn(); // someone checks in
        room.checkIn(); //another person wants to check into the same room

        //assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());

    }

    @Test
    void cannotCheckIfDirty(){
        //arrange
        Room room = new Room();

        //act
        room.checkIn(); // someone checks in
        room.checkOut(); // the person checks out
        room.checkIn(); // someone else wants to check in

        //assert
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    void cannotCleanOccupiedRoom(){
        //arrange
        Room room = new Room();

        //act
        room.checkIn(); // someone is in the room
        room.cleanRoom(); //housekeeper wants to clean the room while it is still occupied

        //assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }
}