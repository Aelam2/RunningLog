import java.util.Date;

public class dayLog {

    Date currentDate = new Date();
    double mileageTotal;
    int timeTotal;
    String runType;

    public dayLog(Date currentDate, String runType, double mileageTotal, int timeTotal){

        this.currentDate = currentDate;
        this.runType = runType;
        this.mileageTotal = mileageTotal;
        this.timeTotal = timeTotal;

    }

    public void totalDayInfo(){
        System.out.printf("On %s, you ran a %s %s run in %s minutes!\nGreat effort!",
                currentDate, mileageTotal, runType, timeTotal);

    }

    public String getRunType(){
        return this.runType;
    }

    public double getMileageTotal(){
        return this.mileageTotal;
    }

    public int getTimeTotal(){
        return this.timeTotal;
    }

    public void updateDate(Date newDate){
        this.currentDate = newDate;
    }
    public void updateTotalMileage(double newTotalMileage){
        this.mileageTotal = newTotalMileage;
    }
    public void updateTotalTime(int newTotalTime){
        this.timeTotal = newTotalTime;
    }
    public void updateRunType(String newRunType){
        this.runType = newRunType;
    }
}
