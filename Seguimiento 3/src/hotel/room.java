package hotel;

public class room {
    private int roomNumber;
    private double pricePerNight;
    private boolean available;
    private String guestsStaying;

    public room(int roomNumber, double pricePerNight, boolean available, String guestsStaying) {
        this.roomNumber = roomNumber;
        this.pricePerNight = pricePerNight;
        this.available = available;
        this.guestsStaying = guestsStaying;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getGuestsStaying() {
        return guestsStaying;
    }

    public void setGuestsStaying(String guestsStaying) {
        this.guestsStaying = guestsStaying;
    }
}
