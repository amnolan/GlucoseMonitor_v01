package glucosemonitor.amnolan.glucosemonitor.models;

public class GlucoseDay {

    private int fasting, breakfast, lunch, dinner;

    String statusFasting, statusBreakfast, statusLunch, statusDinner;

    public GlucoseDay(){
        this.setFasting(0);
        this.setBreakfast(0);
        this.setLunch(0);
        this.setDinner(0);
    }

    public GlucoseDay(int fasting, int breakfast, int lunch, int dinner){
        this.fasting = fasting;
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
    }

    public String getStatusFasting() {
        return statusFasting;
    }

    public void setStatusFasting(String statusFasting) {
        this.statusFasting = statusFasting;
    }

    public String getStatusBreakfast() {
        return statusBreakfast;
    }

    public void setStatusBreakfast(String statusBreakfast) {
        this.statusBreakfast = statusBreakfast;
    }

    public String getStatusLunch() {
        return statusLunch;
    }

    public void setStatusLunch(String statusLunch) {
        this.statusLunch = statusLunch;
    }

    public String getStatusDinner() {
        return statusDinner;
    }

    public void setStatusDinner(String statusDinner) {
        this.statusDinner = statusDinner;
    }

    public int getFasting() {
        return fasting;
    }

    public void setFasting(int fasting) {
        this.fasting = fasting;
    }

    public int getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(int breakfast) {
        this.breakfast = breakfast;
    }

    public int getLunch() {
        return lunch;
    }

    public void setLunch(int lunch) {
        this.lunch = lunch;
    }

    public int getDinner() {
        return dinner;
    }

    public void setDinner(int dinner) {
        this.dinner = dinner;
    }

    public String getStatus(int glucose, boolean fasting){
        String retStr;
        if(fasting){
            if(glucose > 70 && glucose < 99){
                retStr = "Normal";
            }else{
                retStr = "Abnormal";
            }
        }else{
            if(glucose < 70){
                retStr = "Hypoglycemic";
            }else if(glucose > 140){
                retStr = "Abnormal";
            }else{
                // this infers that the level is gt 70 and lt 140
                retStr = "Normal";
            }
        }
        return retStr;
    }

    public int getDailyAverage(){
        // will shave off remainders
        return ( getFasting() + getBreakfast() + getLunch() + getDinner() ) / 4;
    }

}
