
public class Monkey extends  RescueAnimal{
	    private String species;
	    private String tailLength;
	    private String height;
	    private String bodyLength;
		private String breed;
		private String age;
		private String weight;

	    public  Monkey ( String name,String breed, String gender,
	    		String age, String species, String tailLength, String height, String bodyLength, 
	    		String acquisitionDate, String acquisitionCountry, String trainingStatus, boolean reserved, 
	    		String inServiceCountry){
	    	setName(name);
	        setBreed(breed);
	        setGender(gender);
	        setAge(age);
	        setWeight(weight);
	        setAcquisitionDate(acquisitionDate);
	        setAcquisitionLocation(acquisitionCountry);
	        setTrainingStatus(trainingStatus);
	        setReserved(reserved);
	        setInServiceCountry(inServiceCountry);
	        setTailLength(tailLength);
	        setHeight(height);
	        setBodyLength(bodyLength);
		}
	   public String getBreed() {
		   return breed;
	   }
		public void setBreed(String breed) {
			this.breed = breed;
			
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
	    public void setAge(String age) {
	    	this.age = age;
	    	
	    }
	    public String getAge() {
	    	return age;
	    }
	    public void setWeight(String weight) {
	    	this.weight = weight;
	    	
	    }
	    public String getWeight() {
	    	return weight;
	    }

	}


