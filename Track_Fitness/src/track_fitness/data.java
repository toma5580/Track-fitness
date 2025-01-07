
package track_fitness;


public class data {
    private String time;
    private String Date;
    private String Weight;
    private String bp;

    public data() {
    }

    public data(String time, String Date, String Weight, String bp) {
        this.time = time;
        this.Date = Date;
        this.Weight = Weight;
        this.bp = bp;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return Date;
    }

    public String getWeight() {
        return Weight;
    }

    public String getBp() {
        return bp;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public void setWeight(String Weight) {
        this.Weight = Weight;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

    @Override
    public String toString() {
        return "data{" + "time=" + time + ", Date=" + Date + ", Weight=" + Weight + ", bp=" + bp + '}';
    }
    
}
