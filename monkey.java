
public class monkey extends RescueAnimal{
	    private String species;
	    private String tailLength;
	    private String height;
	    private String bodyLength;

	    public  monkey ( String species, String tailLength, String height, String bodyLength, String acquisitionDate, String acquisitionCountry, String trainingStatus, String reserved, String inServiceCountry, String species2, String tailLength2, String height2, String bodyLength2){
	        setSpecies(species);
	        setTailLength(tailLength);
	        setHeight(height);
	        setBodyLength(bodyLength);
	    
		}
		public String getSpecies(){
	        return species;
	    }
	    public void setSpecies(String species){
	        this.species = species;
	    }
	    public String getTailLength(){
	        return tailLength;
	    }
	    public void setTailLength(String tailLength){
	        this.tailLength = tailLength;
	    }
	    public String getHeight(){
	        return height;
	    }
	    public void setHeight(String height){
	        this.height = height;
	    }
	    public String getBodyLength(){
	        return bodyLength;
	    }
	    public void setBodyLength(String bodyLength){
	        this.bodyLength = bodyLength;
	    }

	}


