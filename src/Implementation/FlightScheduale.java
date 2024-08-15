/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementation;

/**
 *
 * @author Ze2reda
 */
public class FlightScheduale {
     private String take_offtime;
    private String landing_time;
    private String flight_time;
   
    
      
    
    public FlightScheduale(String take_offtime, String landing_time, String flight_time)
    {
       this.take_offtime= take_offtime;
        this.landing_time= landing_time;
       this.flight_time= flight_time;           
    
    }
    
    
    public void settake_offtime(String take_offtime)
    {
       this.take_offtime= take_offtime; 
    }
    public void setlanding_time(String  landing_time )
    {
       this.landing_time= landing_time;    
    }
    
    public String  gettake_offtime()
    {
       return take_offtime;
    }
    public String  getlanding_time()
    {
      return landing_time;    
    }
    public void setflight_time(String  flight_time)
    {
       this.flight_time= flight_time;    
    }
public String  getflight_time()
{
   return flight_time;

}
}
