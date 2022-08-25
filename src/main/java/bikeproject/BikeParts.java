package bikeproject;

public interface BikeParts {
    //Constant declaration
    public final String MAKE = "Oracle Bikes";

    //Require methods after implementation
    public String getHandleBars();
    public void setHandleBars(String newValue);
    public String getTyres();
    public void setTyres(String newValue);
    public String getSeatType();
    public void setSeatType(String newValue);
}//End Interface BikeParts
