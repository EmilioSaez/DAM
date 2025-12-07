public class Call {
    private int originNum;
    private int destinyNum;
    private int duration;
    private int timeSlot; //Franja horaria
    private boolean localCall;

    public Call(int originNum, int destinyNum, int duration, int timeSlot,boolean localCall) {
        this.originNum = originNum;
        this.destinyNum = destinyNum;
        this.duration = duration;
        this.timeSlot = timeSlot;
        if (timeSlot>3) {
            this.timeSlot = 3;
        } else if (timeSlot<1) {
            this.timeSlot = 1;
        }
        this.localCall = localCall;
    }

    public int getOriginNum() {
        return originNum;
    }

    public int getDestinyNum() {
        return destinyNum;
    }

    public int getDuration() {
        return duration;
    }

    public int getTimeSlot() {
        return timeSlot;
    }

    public float getPrice() {
        int costSecond;
        if (getTimeSlot() == 1 && !localCall) {
            costSecond = 15;
        } else if (getTimeSlot() == 1 && !localCall) {
            costSecond = 25;
        } else {
            costSecond = 30;
        }
        return costSecond*duration;
    }


    public String toString() {
        return "Origin Number: " + getOriginNum() + "  Destiny Number: " + getDestinyNum() + " Duration: " + getDuration() + "s " +  "Time Slot: " + getTimeSlot()+" "+ "Price of the call: "+getPrice();
    }
}
