package com.programmingfree.springservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name="vransko")
public class Weather {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="year")
	private int year;
	
	@Column(name="month")
	private String month;
	
	@Column(name="day")
	private int day;
	
	@Column(name="hour")
	private String hour;
	
	@Column(name="minute")
	private String minute;
	
	@Column(name="temperature")
	private float temperature ;
	
	@Column(name="humidity")
	private float humidity;
	
	@Column(name="sea_level_pressure")
	private float seaLevelPressure;
	
	@Column(name="precipitation")
	private float precipitation;
	
	@Column(name="snowfall")
	private float snowfall;
	
	@Column(name="total_cloud_cover")
	private float totalCloudCover;
	
	@Column(name="high_cloud_cover")
	private float highCloudCover;
	
	@Column(name="medium_cloud_cover")
	private float mediumCloudCover;
	
	@Column(name="low_cloud_cover")
	private float lowCloudCover;
	
	@Column(name="shortwave_radiation")
	private float shortwaveRadiation;
	
	@Column(name="wind_speed_10")
	private float windSpeed10;
	
	@Column(name="wind_direction_10")
	private float windDirection10;
	
	@Column(name="wind_speed_80")
	private float windSpeed80;
	
	@Column(name="wind_direction_80")
	private float windDirection80;
	
	@Column(name="wind_speed_900")
	private float windSpeed900;
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getMinute() {
		return minute;
	}

	public void setMinute(String minute) {
		this.minute = minute;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getSeaLevelPressure() {
		return seaLevelPressure;
	}

	public void setSeaLevelPressure(float seaLevelPressure) {
		this.seaLevelPressure = seaLevelPressure;
	}

	public float getPrecipitation() {
		return precipitation;
	}

	public void setPrecipitation(float precipitation) {
		this.precipitation = precipitation;
	}

	public float getSnowfall() {
		return snowfall;
	}

	public void setSnowfall(float snowfall) {
		this.snowfall = snowfall;
	}

	public float getTotalCloudCover() {
		return totalCloudCover;
	}

	public void setTotalCloudCover(float totalCloudCover) {
		this.totalCloudCover = totalCloudCover;
	}

	public float getHighCloudCover() {
		return highCloudCover;
	}

	public void setHighCloudCover(float highCloudCover) {
		this.highCloudCover = highCloudCover;
	}

	public float getMediumCloudCover() {
		return mediumCloudCover;
	}

	public void setMediumCloudCover(float mediumCloudCover) {
		this.mediumCloudCover = mediumCloudCover;
	}

	public float getLowCloudCover() {
		return lowCloudCover;
	}

	public void setLowCloudCover(float lowCloudCover) {
		this.lowCloudCover = lowCloudCover;
	}

	public float getShortwaveRadiation() {
		return shortwaveRadiation;
	}

	public void setShortwaveRadiation(float shortwaveRadiation) {
		this.shortwaveRadiation = shortwaveRadiation;
	}

	public float getWindSpeed10() {
		return windSpeed10;
	}

	public void setWindSpeed10(float windSpeed10) {
		this.windSpeed10 = windSpeed10;
	}

	public float getWindDirection10() {
		return windDirection10;
	}

	public void setWindDirection10(float windDirection10) {
		this.windDirection10 = windDirection10;
	}

	public float getWindSpeed80() {
		return windSpeed80;
	}

	public void setWindSpeed80(float windSpeed80) {
		this.windSpeed80 = windSpeed80;
	}

	public float getWindDirection80() {
		return windDirection80;
	}

	public void setWindDirection80(float windDirection80) {
		this.windDirection80 = windDirection80;
	}

	public float getWindSpeed900() {
		return windSpeed900;
	}

	public void setWindSpeed900(float windSpeed900) {
		this.windSpeed900 = windSpeed900;
	}

	public float getWindDirection900() {
		return windDirection900;
	}

	public void setWindDirection900(float windDirection900) {
		this.windDirection900 = windDirection900;
	}

	public float getWindGust() {
		return windGust;
	}

	public void setWindGust(float windGust) {
		this.windGust = windGust;
	}

	@Override
	public String toString() {
		return "Weather [year=" + year + ", month=" + month + ", day=" + day + ", hour=" + hour + ", minute=" + minute
				+ ", temperature=" + temperature + ", humidity=" + humidity + ", seaLevelPressure=" + seaLevelPressure
				+ ", precipitation=" + precipitation + ", snowfall=" + snowfall + ", totalCloudCover=" + totalCloudCover
				+ ", highCloudCover=" + highCloudCover + ", mediumCloudCover=" + mediumCloudCover + ", lowCloudCover="
				+ lowCloudCover + ", shortwaveRadiation=" + shortwaveRadiation + ", windSpeed10=" + windSpeed10
				+ ", windDirection10=" + windDirection10 + ", windSpeed80=" + windSpeed80 + ", windDirection80="
				+ windDirection80 + ", windSpeed900=" + windSpeed900 + ", windDirection900=" + windDirection900
				+ ", windGust=" + windGust + "]";
	}

	@Column(name="wind_direction_900")
	private float windDirection900;
	
	@Column(name="wind_gust_10")
	private float windGust;

	


/*	public int getTaskId() {
		return id;
	}

	public void setTaskId(int taskId) {
		this.id = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}*/



/*	@Override
	public String toString() {
		return "Task [id=" + id + ", taskName=" + taskName
				+ ", taskDescription=" + taskDescription + ", taskPriority="
				+ taskPriority + ",taskStatus=" + taskStatus + "]";
	}
*/
}

