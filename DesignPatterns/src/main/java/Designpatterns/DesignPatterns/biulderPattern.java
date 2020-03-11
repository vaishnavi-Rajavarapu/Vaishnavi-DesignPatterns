package Designpatterns.DesignPatterns;

class Rocket{
	  private int number_of_stages;
	  private String recent_launch;
	  private int total_launches;
	  
	  public int getStages() {
	    return this.number_of_stages;
	  }
	  
	  public String getLaunch() {
	    return this.recent_launch;
	  }
	  
	  public int getLaunches() {
	    return this.total_launches;
	  }
	  
	  private Rocket(SatelliteVehicles builder) {
	    this.number_of_stages = builder.number_of_stages;
	    this.recent_launch = builder.recent_launch;
	    this.total_launches = builder.total_launches;
	  }
public static class SatelliteVehicles {
	    public int number_of_stages;
		private String recent_launch;
	    private int total_launches;
	    public SatelliteVehicles(int number_of_stages,String recent_launch, int total_launches) {
	      this.number_of_stages=number_of_stages;
	      this.recent_launch = recent_launch;
	      this.total_launches = total_launches;
	    }
	    
	    public SatelliteVehicles setLaunches(int total_launches) {
	      this.total_launches = total_launches;
	      return this;
	    }
	    
	    public Rocket build() {
	      return new Rocket(this);
	    }
	  }
	}

	public class biulderPattern{
	  
	  public static void main(String[] args) {
	    Rocket PSLV = new Rocket.SatelliteVehicles(4,"---PSLV-C40/Cartosat-2---", 50).setLaunches(50).build();
	    Rocket GSLV = new Rocket.SatelliteVehicles(3,"---GSLV-Mk III-M1/Chandrayaan 2---", 13).build();
    System.out.println("Polar Satellite Launch Vehicle");
    System.out.println(PSLV.getStages());
    System.out.println(PSLV.getLaunch());
    System.out.println(PSLV.getLaunches());
    System.out.println("Geosynchronous Satellite Launch Vehicle");
    System.out.println(GSLV.getStages());
    System.out.println(GSLV.getLaunch());
    System.out.println(GSLV.getLaunches());
  }
}