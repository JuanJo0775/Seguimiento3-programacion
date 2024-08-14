package hotel;

public class MainRoom {
    public static void main(String[] args) {
        room[] rooms = new room[5];

        rooms[0] = new room(101, 5000, true, "None");
        rooms[1] = new room(102, 6000, true, "None");
        rooms[2] = new room(103, 7000, false, "Jhonny Deep");
        rooms[3] = new room(104, 8000, false, "John Cena");
        rooms[4] = new room(105, 9000, true, "None");

        for (room room : rooms) {
            System.out.println("Room No.: " + room.getRoomNumber());
            System.out.println("Price per night: " + room.getPricePerNight());
            System.out.println("Availability: " + (room.isAvailable() ? "Available" : "Occupied"));
            System.out.println("Guests Staying: " + room.getGuestsStaying());
        }
        System.out.println("///////////////////////////////////////////////////");

        rooms[1].setPricePerNight(4000);
        rooms[1].setAvailable(false);
        rooms[1].setGuestsStaying("Cristobal Colón");

        for (room room : rooms) {
            System.out.println("Room No.: " + room.getRoomNumber());
            System.out.println("Price per night: " + room.getPricePerNight());
            System.out.println("Availability: " + (room.isAvailable() ? "Available" : "Occupied"));
            System.out.println("Guests Staying: " + room.getGuestsStaying());
        }
    }
}
