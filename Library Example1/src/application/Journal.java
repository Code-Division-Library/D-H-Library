package application;

import java.util.Date;

public class Journal {

		private String title;
	 	private int volume;
	    private Date date;
	    private String releaseDate;
	    private String country;
	    private int addedByVolume;
	    private String addedByName;
	    private int amount;
		public Journal(String title, int volume, Date date, String releaseDate, String country, int addedByVolume,
				String addedByName, int amount) {
			
			this.title = title;
			this.volume = volume;
			this.date = date;
			this.releaseDate = releaseDate;
			this.country = country;
			this.addedByVolume = addedByVolume;
			this.addedByName = addedByName;
			this.amount = amount;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getVolume() {
			return volume;
		}
		public void setVolume(int volume) {
			this.volume = volume;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public String getReleaseDate() {
			return releaseDate;
		}
		public void setReleaseDate(String releaseDate) {
			this.releaseDate = releaseDate;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public int getAddedByVolume() {
			return addedByVolume;
		}
		public void setAddedByVolume(int addedByVolume) {
			this.addedByVolume = addedByVolume;
		}
		public String getAddedByName() {
			return addedByName;
		}
		public void setAddedByName(String addedByName) {
			this.addedByName = addedByName;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
	    
	    
	
}
