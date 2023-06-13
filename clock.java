class Clock{
	int hour;
	int minutes;
	int seconds;
	
	Clock(){
		hour = 12;
		minutes = 0;
		seconds = 0;
	}
	Clock(int h, int m, int s){
		hour = h;
		minutes = m;
		seconds = s;
	}
	Clock(int s){
		hour = s/(60*60);
		int reminde = s%(60*60);
		minutes = reminde/60;
		seconds = reminde%60;
	}
	void setClock(int s){
		hour = s/(60*60);
		int reminde = s%(60*60);
		minutes = reminde/60;
		seconds = reminde%60;
	}
	void setHour(int h){
		if(h > 24){
			hour = h;
		}
		else{
			System.out.println("invalid hour");
		}
	}
	void setMinutes(int m){
		if(m > 60){
			minutes = m;
		}
		else{
			System.out.println("invalid minutes");
		}
	}
	void setSecond(int s){
		if(s > 60){
			seconds = s;
		}
		else{
			System.out.println("invalid seconds");
		}
	}
	int getHour(){
		return hour;
	}
	int getMinutes(){
		return minutes;
	}
	int getSecond(){
		return seconds;
	}
	void tick(){
		seconds++;
		if(seconds >= 60){
			seconds = 0;
			minutes++;
			if(minutes >= 60){
				minutes = 0;
				hour++;
				if(hour >= 24){
					hour = 0;
				}
				else{
					System.out.println("worng time");
				}
			}
		}
	}
	void addClock(Clock ca){
		Clock cb = new Clock(hour,minutes,seconds);
		cb.hour = cb.hour + ca.hour;
		cb.minutes = cb.minutes + ca.minutes;
		cb.seconds = cb.seconds + ca.seconds;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	