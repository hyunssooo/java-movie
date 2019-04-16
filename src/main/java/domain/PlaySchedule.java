package domain;

import java.time.LocalDateTime;

import static utils.DateTimeUtils.format;

public class PlaySchedule {
    private final LocalDateTime startDateTime;
    private int capacity;

    PlaySchedule(LocalDateTime startDateTime, int capacity) {
        this.startDateTime = startDateTime;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return getStartDateTime() + " 예약가능인원: " + getCapacity() + "\n";
    }

    public String getStartDateTime() {
        return "시작시간: " + format(startDateTime);
    }

    public int getCapacity() {
        return capacity;
    }
}
